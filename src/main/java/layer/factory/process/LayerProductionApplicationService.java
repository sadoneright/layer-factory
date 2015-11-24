package layer.factory.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import layer.factory.domain.Factory;
import layer.factory.domain.FactoryDomainService;
import layer.factory.domain.FactoryName;
import layer.factory.domain.IFactoryDomainService;
import layer.factory.domain.ILayerDomainService;
import layer.factory.domain.Layer;
import layer.factory.domain.LayerQuantity;

public class LayerProductionApplicationService implements ILayerProductionApplicationService {

	private IFactoryDomainService factoryDomainService;

	private ILayerDomainService layerDomainService;
	Random rand = new Random();
	Long factoryId = rand.nextLong();

	public LayerProductionApplicationService(IFactoryDomainService factoryDomainService,
			ILayerDomainService layerDomainService) {
		this.layerDomainService = layerDomainService;
		this.factoryDomainService = factoryDomainService;
	}

	public FactoryInfo openFactory(String factoryName) {
		FactoryName name = new FactoryName(factoryName);

		Factory factory = this.factoryDomainService.openFactory(factoryId, name);

		FactoryInfo factoryInfo = new FactoryInfo(factory.getName().getFactoryName());
		factoryInfo.setOpened(true);
		return factoryInfo;
	}

	public List<LayerInfo> produceLayers(String factoryName, int numberOfLayers) {

		LayerQuantity quanity = new LayerQuantity(numberOfLayers);

		List<Layer> producedLayers = this.layerDomainService.produceLayers(quanity);

		this.factoryDomainService.assignProducedLayers(factoryId, producedLayers);

		List<LayerInfo> infos = new ArrayList<LayerInfo>();
		for (Layer layer : producedLayers) {
			infos.add(new LayerInfo());
		}
		return infos;
	}

}
