package layer.factory.domain;

import java.util.List;

public class FactoryDomainService implements IFactoryDomainService {
	private IFactoryRepository repository;

	public FactoryDomainService(IFactoryRepository repository) {
		this.repository = repository;
	}

	public Factory openFactory(Long factoryId, FactoryName name) {
		Factory factory = new Factory(factoryId, name);

		factory.open();

		this.repository.save(factory);

		return factory;
	}

	public void assignProducedLayers(Long factoryId, List<Layer> producedLayers) {
		Factory factory = this.repository.load(factoryId);

		factory.assign(producedLayers);

		this.repository.update(factory);
	}
}
