package layer.factory.domain;

import java.util.List;

public interface IFactoryDomainService {

	Factory openFactory(Long factoryId, FactoryName name);

	void assignProducedLayers(Long factoryId, List<Layer> producedLayers);
}
