// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.logz.inputs.IdentityPropertiesArgs;
import io.pulumi.azurenative.logz.inputs.MonitorPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MonitorArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitorArgs Empty = new MonitorArgs();

    @Import(name="identity")
      private final @Nullable Output<IdentityPropertiesArgs> identity;

    public Output<IdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName")
      private final @Nullable Output<String> monitorName;

    public Output<String> getMonitorName() {
        return this.monitorName == null ? Codegen.empty() : this.monitorName;
    }

    /**
     * Properties specific to the monitor resource.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<MonitorPropertiesArgs> properties;

    public Output<MonitorPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public MonitorArgs(
        @Nullable Output<IdentityPropertiesArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<String> monitorName,
        @Nullable Output<MonitorPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.identity = identity;
        this.location = location;
        this.monitorName = monitorName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private MonitorArgs() {
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.monitorName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IdentityPropertiesArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<String> monitorName;
        private @Nullable Output<MonitorPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder identity(@Nullable Output<IdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder monitorName(@Nullable Output<String> monitorName) {
            this.monitorName = monitorName;
            return this;
        }
        public Builder monitorName(@Nullable String monitorName) {
            this.monitorName = Codegen.ofNullable(monitorName);
            return this;
        }
        public Builder properties(@Nullable Output<MonitorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable MonitorPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public MonitorArgs build() {
            return new MonitorArgs(identity, location, monitorName, properties, resourceGroupName, tags);
        }
    }
}
