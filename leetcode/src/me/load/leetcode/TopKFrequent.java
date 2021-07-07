package me.load.leetcode;

import java.util.*;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2018/9/12
 */
public class TopKFrequent {

    public static void main(String[] args) {

        String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};

        TopKFrequent topKFrequent = new TopKFrequent();
        System.out.println(topKFrequent.topKFrequent(words, 2));
    }

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, WordWithFrequency> wordWithFrequencyMap = new HashMap<>();

        PriorityQueue<WordWithFrequency> topKWordWithFrequency;

        for (String word : words) {
            addWord2Map(wordWithFrequencyMap, word);
        }

        topKWordWithFrequency = getKFrequent(wordWithFrequencyMap, k);

        return getKFrequentWords(topKWordWithFrequency);
    }

    private PriorityQueue<WordWithFrequency> getKFrequent(Map<String, WordWithFrequency> wordWithFrequencyMap, int k) {

        PriorityQueue<WordWithFrequency> topKFrequentWord = new PriorityQueue<>(k);

        int tmp = 0;
        for (WordWithFrequency wordWithFrequency : wordWithFrequencyMap.values()) {
            if (tmp < k) {
                topKFrequentWord.add(wordWithFrequency);
                tmp++;
            } else {
                if (wordWithFrequency.compareTo(topKFrequentWord.peek()) > 0) {
                    topKFrequentWord.poll();
                    topKFrequentWord.offer(wordWithFrequency);
                }
            }
        }

        return topKFrequentWord;
    }

    private List<String> getKFrequentWords(PriorityQueue<WordWithFrequency> topKFrequentWord) {
        List<WordWithFrequency> topKWordWithFrequency = new ArrayList<>();
        List<String> topKWords = new ArrayList<>();

        Iterator<WordWithFrequency> iterator = topKFrequentWord.iterator();
        while (iterator.hasNext()) {
            topKWordWithFrequency.add(iterator.next());
        }
        Collections.sort(topKWordWithFrequency);

        for (int i = topKWordWithFrequency.size() - 1; i >= 0; i--) {
            topKWords.add(topKWordWithFrequency.get(i).word);
        }
        return topKWords;
    }

    private void addWord2Map(Map<String, WordWithFrequency> wordWithFrequencyMap, String word) {
        if (wordWithFrequencyMap.get(word) == null) {
            wordWithFrequencyMap.put(word, new WordWithFrequency(word, 1));
        } else {
            wordWithFrequencyMap.get(word).increaseFrequency();
        }
    }

    class WordWithFrequency implements Comparable<WordWithFrequency> {

        String word;
        int frequency;

        public WordWithFrequency(String word, Integer frequency) {
            this.word = word;
            this.frequency = frequency;
        }

        void increaseFrequency() {
            this.frequency = this.frequency + 1;
        }

        @Override
        public int compareTo(WordWithFrequency o) {
            if (o.frequency != this.frequency) {
                return this.frequency - o.frequency;
            }
            return this.word.compareTo(o.word) * -1;
        }
    }


}
