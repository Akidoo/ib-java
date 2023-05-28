public class testAlgorithm {

    static char[] punctuation = { ',', '.', '\"', '\'', ':', ';', '(', ')', '?', '!' };
    public static int nLetters(String words) {
        int count = 0;
        char[] wordc = words.toCharArray();
        while (wordc[count] != ' ')
        {
            count = count + 1;
        }
        for(int i = 0; i<wordc.length; i++){
			for(int j = 0; j<punctuation.length; j++){
				if(wordc[i] == punctuation[j]){
					count = count-1;
					}
				}
			}
        return count;
    }
    public static int nWords(String sentence) {
		int count = 0;
		char[] sentencec = sentence.toCharArray();
		for(int i = 0; i<sentencec.length; i++){
			if(sentencec[i] == ' '){
				count = count + 1;
				}
				else if(sentencec[i] == '.'){
					count = count +1;
					break;
					}
			}
			return count;
		}

    public static void main(String[] args)
    {
        System.out.println("nLetters(\"green, \") = " + nLetters("green, "));
        System.out.println("nLetters(\"green \") = " + nLetters("green "));
    }
}
