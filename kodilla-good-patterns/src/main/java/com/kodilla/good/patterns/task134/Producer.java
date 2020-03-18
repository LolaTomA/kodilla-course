package com.kodilla.good.patterns.task134;

public abstract class Producer {
    final String producerName;
    final String producerAddress;

    public Producer(final String producerName, final String producerAddress) {
        this.producerName = producerName;
        this.producerAddress = producerAddress;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerAddress() {
        return producerAddress;
    }

    public String toString() {
        return producerName + " address: " + producerAddress;
    }

    public abstract boolean process(Product product);
}
