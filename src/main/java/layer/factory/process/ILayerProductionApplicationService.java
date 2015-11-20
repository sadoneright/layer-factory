package layer.factory.process;

import java.util.List;

public interface ILayerProductionApplicationService {
	FactoryInfo openFactory(String factoryName);

	List<LayerInfo> produceLayers(String factoryName, int numberOfLayers);
}
