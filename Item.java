class Item {
	int id;
	String name;
	double price;
	char taxType;

	public Item(int id, String name, double price, char taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTaxType() {
		return taxType;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}

	double taxReturn() {
		if (taxType == 'А') {
			return price * 0.18 * 0.15;
		} else if (taxType == 'Б') {
			return price * 0.05 * 0.15;
		}
		return 0;
	}
}