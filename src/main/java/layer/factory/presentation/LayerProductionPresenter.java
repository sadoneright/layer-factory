package layer.factory.presentation;

import java.util.List;
import java.util.Random;

import layer.factory.cross.ICallback;
import layer.factory.cross.Logger;
import layer.factory.domain.Layer;
import layer.factory.process.FactoryInfo;
import layer.factory.process.ILayerProductionApplicationService;
import layer.factory.process.LayerInfo;

public class LayerProductionPresenter {
	private LayerProductionView view;

	private ILayerProductionApplicationService layerProductionApplicationService;

	public LayerProductionPresenter(LayerProductionView view,
			ILayerProductionApplicationService layerProductionApplicationService) {
		this.layerProductionApplicationService = layerProductionApplicationService;
		this.view = view;
	}

	public void initialize() {
		Logger.log("Initializing presenter");
		handleOpenFactoryClicked = new ICallback() {

			public void call() {
				handleOpenFactoryClicked();
			}
		};
		handleProduceLayerClicked = new ICallback() {

			public void call() {
				handleProduceLayerClicked();
			}
		};
	}

	public ICallback handleProduceLayerClicked;
	public ICallback handleOpenFactoryClicked;
	Random rand = new Random();

	private void handleProduceLayerClicked() {
		Logger.log("Handling Produce Layer Clicked Event");

		List<LayerInfo> layers = this.layerProductionApplicationService.produceLayers("TestFactory", rand.nextInt(255));
		this.view.update(layers);
	}

	private void handleOpenFactoryClicked() {
		Logger.log("Handling Open Factory Clicked Event");

		FactoryInfo factoryInfo = this.layerProductionApplicationService.openFactory("TestFactory");

		Logger.log("Factory " + factoryInfo.getName() + " opened.");
	}
}
