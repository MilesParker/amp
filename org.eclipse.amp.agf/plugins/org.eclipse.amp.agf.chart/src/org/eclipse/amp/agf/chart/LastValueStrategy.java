package org.eclipse.amp.agf.chart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public abstract class LastValueStrategy extends BasicChartStrategy {

    protected Collection<String> labels = new HashSet<String>();

    protected List<Double> numbers = new ArrayList<Double>();

    public void updateSelection() {
        numbers.clear();
        labels.clear();
        for (Object valueSet : dataProvider.getValueSets(dataSource)) {
            List<Double> values = (List<Double>) dataProvider.getValues(valueSet);
            numbers.add(0.0);
            String text = dataProvider.getText(valueSet);
            labels.add(text);
        }
    }

    public void update() {
        int index = 0;
        for (Object valueSet : dataProvider.getValueSets(dataSource)) {
            List<Double> values = (List<Double>) dataProvider.getValues(valueSet);
            numbers.set(index++, values.get(values.size() - 1));
        }
    }

    public void setLabels(Collection<String> labels) {
        this.labels = labels;
    }

    public Collection<String> getLabels() {
        return labels;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }

    public List<Double> getNumbers() {
        return numbers;
    }
}
