package layer.factory.presentation;

import java.util.List;

import layer.factory.cross.ICallback;
import layer.factory.cross.Logger;
import layer.factory.process.LayerInfo;

public class LayerProductionView {

	public void update(List<LayerInfo> layers) {
		int count = 0;

		for (LayerInfo layerInfo : layers) {
			count++;
			Logger.log("Updating view for layer " + count);
		}
	}

	public void clickOpenFactory(ICallback callback) {
		callback.call();
	}

	public void clickProduceLayer(ICallback callback) {
		callback.call();
	}
}
