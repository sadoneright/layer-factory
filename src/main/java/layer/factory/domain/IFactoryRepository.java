package layer.factory.domain;

public interface IFactoryRepository {

	void save(Factory factory);

	Factory load(Long factoryId);

	void update(Factory factory);
}
