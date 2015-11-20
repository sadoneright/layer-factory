package layer.factory.domain;

public class LayerQuantity {
	private int numberOfLayers;

	public LayerQuantity(int numberOfLayers) {
		if (numberOfLayers < 1) {
			throw new IllegalArgumentException("numberOfLayers: " + numberOfLayers + " Should be greater than one.");
		}

		if (numberOfLayers > 255) {
			throw new IllegalArgumentException("numberOfLayers: " + numberOfLayers + " Should be smaller than 256.");
		}

		this.numberOfLayers = numberOfLayers;
	}

	public int getNumberOfLayers() {
		return numberOfLayers;
	}

	public void setNumberOfLayers(int numberOfLayers) {
		this.numberOfLayers = numberOfLayers;
	}

}
