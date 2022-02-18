// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse {
    /**
     * The channel of the audio that the data applies to.
     * 
     */
    private final Integer channelTag;
    /**
     * Data specifying sentiment.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;

    @OutputCustomType.Constructor({"channelTag","sentimentData"})
    private GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse(
        Integer channelTag,
        GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData) {
        this.channelTag = Objects.requireNonNull(channelTag);
        this.sentimentData = Objects.requireNonNull(sentimentData);
    }

    /**
     * The channel of the audio that the data applies to.
     * 
     */
    public Integer getChannelTag() {
        return this.channelTag;
    }
    /**
     * Data specifying sentiment.
     * 
     */
    public GoogleCloudContactcenterinsightsV1SentimentDataResponse getSentimentData() {
        return this.sentimentData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer channelTag;
        private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelTag = defaults.channelTag;
    	      this.sentimentData = defaults.sentimentData;
        }

        public Builder setChannelTag(Integer channelTag) {
            this.channelTag = Objects.requireNonNull(channelTag);
            return this;
        }

        public Builder setSentimentData(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData) {
            this.sentimentData = Objects.requireNonNull(sentimentData);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse(channelTag, sentimentData);
        }
    }
}
