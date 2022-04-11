// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueAppEngineRoutingOverrideGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueAppEngineRoutingOverrideGetArgs Empty = new QueueAppEngineRoutingOverrideGetArgs();

    /**
     * - 
     * The host that the task is sent to.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * App instance.
     * By default, the task is sent to an instance which is available when the task is attempted.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    /**
     * App service.
     * By default, the task is sent to the service which is the default service when the task is attempted.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * App version.
     * By default, the task is sent to the version which is the default version when the task is attempted.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public QueueAppEngineRoutingOverrideGetArgs(
        @Nullable Output<String> host,
        @Nullable Output<String> instance,
        @Nullable Output<String> service,
        @Nullable Output<String> version) {
        this.host = host;
        this.instance = instance;
        this.service = service;
        this.version = version;
    }

    private QueueAppEngineRoutingOverrideGetArgs() {
        this.host = Codegen.empty();
        this.instance = Codegen.empty();
        this.service = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueAppEngineRoutingOverrideGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> host;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> service;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueAppEngineRoutingOverrideGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public QueueAppEngineRoutingOverrideGetArgs build() {
            return new QueueAppEngineRoutingOverrideGetArgs(host, instance, service, version);
        }
    }
}
