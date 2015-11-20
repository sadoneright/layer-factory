package layer.factory.domain;

import layer.factory.data.Database;

public class FactoryRepository implements IFactoryRepository {

	public void save(Factory factory) {
		Database.insert(factory.getId(), factory);
	}

	public Factory load(Long factoryId) {
		return (Factory) Database.select(factoryId);
	}

	public void update(Factory factory) {
		Database.update(factory.getId(), factory);

	}

}
