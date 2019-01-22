package demo.batch;

import org.springframework.batch.item.file.transform.LineAggregator;

public class PassThroughLineAggregator<T> implements LineAggregator<T> {

    public String aggregate(T item) {
        return item.toString();
    }
}