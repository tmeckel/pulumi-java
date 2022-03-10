// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetStreamConsumerResult {
    private final String arn;
    /**
     * Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
     * 
     */
    private final String creationTimestamp;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The current status of the stream consumer.
     * 
     */
    private final String status;
    private final String streamArn;

    @OutputCustomType.Constructor
    private GetStreamConsumerResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("streamArn") String streamArn) {
        this.arn = arn;
        this.creationTimestamp = creationTimestamp;
        this.id = id;
        this.name = name;
        this.status = status;
        this.streamArn = streamArn;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The current status of the stream consumer.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    public String getStreamArn() {
        return this.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamConsumerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String creationTimestamp;
        private String id;
        private String name;
        private String status;
        private String streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamConsumerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder streamArn(String streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }
        public GetStreamConsumerResult build() {
            return new GetStreamConsumerResult(arn, creationTimestamp, id, name, status, streamArn);
        }
    }
}
