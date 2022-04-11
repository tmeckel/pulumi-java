// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.CollectorPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerCollectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCollectorArgs Empty = new ServerCollectorArgs();

    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
      private final Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName;
    }

    @Import(name="properties")
      private final @Nullable Output<CollectorPropertiesArgs> properties;

    public Output<CollectorPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a Server collector within a project.
     * 
     */
    @Import(name="serverCollectorName")
      private final @Nullable Output<String> serverCollectorName;

    public Output<String> getServerCollectorName() {
        return this.serverCollectorName == null ? Codegen.empty() : this.serverCollectorName;
    }

    public ServerCollectorArgs(
        @Nullable Output<String> eTag,
        Output<String> projectName,
        @Nullable Output<CollectorPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> serverCollectorName) {
        this.eTag = eTag;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverCollectorName = serverCollectorName;
    }

    private ServerCollectorArgs() {
        this.eTag = Codegen.empty();
        this.projectName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverCollectorName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private Output<String> projectName;
        private @Nullable Output<CollectorPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serverCollectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.projectName = defaults.projectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverCollectorName = defaults.serverCollectorName;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder projectName(Output<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        public Builder projectName(String projectName) {
            this.projectName = Output.of(Objects.requireNonNull(projectName));
            return this;
        }
        public Builder properties(@Nullable Output<CollectorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable CollectorPropertiesArgs properties) {
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
        public Builder serverCollectorName(@Nullable Output<String> serverCollectorName) {
            this.serverCollectorName = serverCollectorName;
            return this;
        }
        public Builder serverCollectorName(@Nullable String serverCollectorName) {
            this.serverCollectorName = Codegen.ofNullable(serverCollectorName);
            return this;
        }        public ServerCollectorArgs build() {
            return new ServerCollectorArgs(eTag, projectName, properties, resourceGroupName, serverCollectorName);
        }
    }
}
