
# Comments Filter - task

We filter spam, comments with negative content and comments that are too long.
1) *Spam* will be filtered by the presence of the **specified keywords** in the text.
2) *Negative content* will be determined by the presence of one of three emoticons – **:( =( :|**
3) *Too long comments* will be determined based on given number – the **maximum length** of the comment. 


#### Abstract the filter in the form of the following interface:
```java
interface TextAnalyzer {
    Label processText(String text);
}   
```

#### Label – enumeration, which contains labels with which we will mark the text:
```java
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}
```

## Classes
1. *SpamAnalyzer* should be constructed from an array of strings with keywords. An object of this class must keep this array of strings in its state in the private **keywords** field.
2. *NegativeTextAnalyzer* should be constructed by the default constructor.
3. *TooLongTextAnalyzer* should be constructed from `int` with the maximum allowable comment length. An object of this class must keep this number in its state in the private **maxLength** field.
4. Abstract *KeywordAnalyzer* class:
- Let's highlight two abstract methods *getKeywords* and *getLabel*, one of which will return a **set of keywords**, and the second a **label** that needs to mark positive responses. We don't need to show these methods to class consumers, so we'll leave access to them only for heirs.
- We implement *processText* in such a way that it depends only on getKeywords and getLabel.
- Let's make SpamAnalyzer and NegativeTextAnalyzer inheritors of KeywordAnalyzer and implement abstract methods.

The final touch is to write the *checkLabels* method, which will return a label for a comment on a set of text analyzers. checkLabels should return the first non-OK label in the order of a given set of analyzers, and OK if all analyzers returned OK.  

As a result, implement the KeywordAnalyzer, SpamAnalyzer, NegativeTextAnalyzer and TooLongTextAnalyzer classes and the checkLabels method. TextAnalyzer and Label are already connected, you will not need extra imports.

*P.S. source - https://stepik.org/lesson/14513/step/9?unit=4147*