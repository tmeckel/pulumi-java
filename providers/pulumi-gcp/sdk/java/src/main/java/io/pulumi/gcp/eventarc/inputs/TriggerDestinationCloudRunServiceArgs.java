// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerDestinationCloudRunServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerDestinationCloudRunServiceArgs Empty = new TriggerDestinationCloudRunServiceArgs();

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Required. The region the Cloud Run service is deployed in.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Required. The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project of the trigger object can be addressed.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    public TriggerDestinationCloudRunServiceArgs(
        @Nullable Output<String> path,
        @Nullable Output<String> region,
        Output<String> service) {
        this.path = path;
        this.region = region;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private TriggerDestinationCloudRunServiceArgs() {
        this.path = Codegen.empty();
        this.region = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDestinationCloudRunServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> path;
        private @Nullable Output<String> region;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDestinationCloudRunServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.service = defaults.service;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public TriggerDestinationCloudRunServiceArgs build() {
            return new TriggerDestinationCloudRunServiceArgs(path, region, service);
        }
    }
}
