package org.sample.ad.serve;

public class ImpressionAdServiceImpl extends ImpressionAdServiceGrpc.ImpressionAdServiceImplBase {
    @Override
    public void IncrementImpression(IncrementImpressionAdRequest request, StreamObserver<IncrementImpressionAdResponse> responseObserver) {
        