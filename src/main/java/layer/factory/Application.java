package layer.factory;

import layer.factory.domain.FactoryDomainService;
import layer.factory.domain.FactoryRepository;
import layer.factory.domain.LayerDomainService;
import layer.factory.domain.LayerRepository;
import layer.factory.presentation.LayerProductionPresenter;
import layer.factory.presentation.LayerProductionView;
import layer.factory.process.LayerProductionApplicationService;

public class Application {

	private LayerProductionView view;
	private LayerProductionPresenter presenter;

	public Application() {

	}

	public void setUp() {
		this.view = new LayerProductionView();
		this.presenter = new LayerProductionPresenter(this.view, new LayerProductionApplicationService(
				new FactoryDomainService(new FactoryRepository()), new LayerDomainService(new LayerRepository())));
		this.presenter.initialize();
	}

	public void run() {
		this.view.clickOpenFactory(presenter.handleOpenFactoryClicked);
		this.view.clickProduceLayer(presenter.handleProduceLayerClicked);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setUp();
		app.run();
	}
}
