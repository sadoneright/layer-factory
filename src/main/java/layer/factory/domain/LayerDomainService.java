package layer.factory.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LayerDomainService implements ILayerDomainService {

	private ILayerRepository repository;
	Random rand = new Random();

	public LayerDomainService(ILayerRepository repository) {
		this.repository = repository;
	}

	public List<Layer> produceLayers(LayerQuantity quantity) {
		int counts = quantity.getNumberOfLayers();
		List<Layer> layers = new ArrayList<Layer>();
		for (int j = 0; j < counts; j++) {
			layers.add(new Layer(rand.nextLong()));
		}
		for (Layer layer : layers) {
			this.repository.save(layer);
		}

		return layers;
	}

}
