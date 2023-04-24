public class SurpriseSort {
	private int[] array;
	private boolean ascending;
	
	public SurpriseSort(int[] array, boolean ascending) {
		this.array = array;
	}
	
	public int[] sort() {
		for(int i = 0; i < this.array.length - 1; i++) {
			if(this.ascending && this.array[i] > this.array[i + 1]) {
				this.array[i] = null;
			} else if (!this.ascending && this.array[i] < this.array[i + 1]) {
				this.array[i] = null;
			}
		}
		return this.array;
	}
	
}
