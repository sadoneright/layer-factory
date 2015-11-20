package layer.factory.domain;

import java.util.ArrayList;
import java.util.List;

import layer.factory.cross.SystemClock;

public class Factory {
	private Long factoryId;

	private List<Layer> producedLayers;

	public Long openedAt;

	public FactoryName name;

	public Factory(Long factoryId, FactoryName name) {
		this.factoryId = factoryId;
		this.name = name;

		this.producedLayers = new ArrayList<Layer>();
	}

	public Long getId() {
		return factoryId;
	}

	public void setId(Long factoryId) {
		this.factoryId = factoryId;
	}

	public List<Layer> getProducedLayers() {
		return producedLayers;
	}

	public void setProducedLayers(List<Layer> producedLayers) {
		this.producedLayers = producedLayers;
	}

	public Long getOpenedAt() {
		return openedAt;
	}

	public void setOpenedAt(Long openedAt) {
		this.openedAt = openedAt;
	}

	public FactoryName getName() {
		return name;
	}

	public void setName(FactoryName name) {
		this.name = name;
	}

	public void open() {
		this.openedAt = SystemClock.now();
	}

	public void assign(List<Layer> layers) {
		this.producedLayers.addAll(layers);
	}
}
