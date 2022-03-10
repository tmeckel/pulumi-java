// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobAppEngineHttpTargetAppEngineRoutingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobAppEngineHttpTargetAppEngineRoutingGetArgs Empty = new JobAppEngineHttpTargetAppEngineRoutingGetArgs();

    /**
     * App instance.
     * By default, the job is sent to an instance which is available when the job is attempted.
     * 
     */
    @InputImport(name="instance")
      private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * App service.
     * By default, the job is sent to the service which is the default service when the job is attempted.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * App version.
     * By default, the job is sent to the version which is the default version when the job is attempted.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public JobAppEngineHttpTargetAppEngineRoutingGetArgs(
        @Nullable Input<String> instance,
        @Nullable Input<String> service,
        @Nullable Input<String> version) {
        this.instance = instance;
        this.service = service;
        this.version = version;
    }

    private JobAppEngineHttpTargetAppEngineRoutingGetArgs() {
        this.instance = Input.empty();
        this.service = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAppEngineHttpTargetAppEngineRoutingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instance;
        private @Nullable Input<String> service;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAppEngineHttpTargetAppEngineRoutingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder instance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder service(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public JobAppEngineHttpTargetAppEngineRoutingGetArgs build() {
            return new JobAppEngineHttpTargetAppEngineRoutingGetArgs(instance, service, version);
        }
    }
}
