package layer.factory.domain;

import java.util.List;

public interface ILayerDomainService {
	 List<Layer> produceLayers(LayerQuantity quantity);
}
