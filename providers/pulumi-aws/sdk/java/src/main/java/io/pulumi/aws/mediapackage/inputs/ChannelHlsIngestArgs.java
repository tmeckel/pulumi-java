// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediapackage.inputs;

import io.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelHlsIngestArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelHlsIngestArgs Empty = new ChannelHlsIngestArgs();

    /**
     * A list of the ingest endpoints
     * 
     */
    @Import(name="ingestEndpoints")
      private final @Nullable Output<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints;

    public Output<List<ChannelHlsIngestIngestEndpointArgs>> getIngestEndpoints() {
        return this.ingestEndpoints == null ? Codegen.empty() : this.ingestEndpoints;
    }

    public ChannelHlsIngestArgs(@Nullable Output<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints) {
        this.ingestEndpoints = ingestEndpoints;
    }

    private ChannelHlsIngestArgs() {
        this.ingestEndpoints = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelHlsIngestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelHlsIngestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestEndpoints = defaults.ingestEndpoints;
        }

        public Builder ingestEndpoints(@Nullable Output<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }
        public Builder ingestEndpoints(@Nullable List<ChannelHlsIngestIngestEndpointArgs> ingestEndpoints) {
            this.ingestEndpoints = Codegen.ofNullable(ingestEndpoints);
            return this;
        }
        public Builder ingestEndpoints(ChannelHlsIngestIngestEndpointArgs... ingestEndpoints) {
            return ingestEndpoints(List.of(ingestEndpoints));
        }        public ChannelHlsIngestArgs build() {
            return new ChannelHlsIngestArgs(ingestEndpoints);
        }
    }
}
