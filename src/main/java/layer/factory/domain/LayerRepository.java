package layer.factory.domain;

import layer.factory.data.Database;

public class LayerRepository implements ILayerRepository {

	public void save(Layer layer) {
		Database.insert(layer.getId(), layer);
	}

}
