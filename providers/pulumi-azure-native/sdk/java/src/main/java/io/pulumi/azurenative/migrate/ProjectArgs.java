// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.ProjectPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * For optimistic concurrency control.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * Azure location in which project is created.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName")
      private final @Nullable Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName == null ? Codegen.empty() : this.projectName;
    }

    /**
     * Properties of the project.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ProjectPropertiesArgs> properties;

    public Output<ProjectPropertiesArgs> getProperties() {
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
     * Tags provided by Azure Tagging service.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ProjectArgs(
        @Nullable Output<String> eTag,
        @Nullable Output<String> location,
        @Nullable Output<String> projectName,
        @Nullable Output<ProjectPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Object> tags) {
        this.eTag = eTag;
        this.location = location;
        this.projectName = projectName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ProjectArgs() {
        this.eTag = Codegen.empty();
        this.location = Codegen.empty();
        this.projectName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private @Nullable Output<String> location;
        private @Nullable Output<String> projectName;
        private @Nullable Output<ProjectPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.location = defaults.location;
    	      this.projectName = defaults.projectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
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
        public Builder projectName(@Nullable Output<String> projectName) {
            this.projectName = projectName;
            return this;
        }
        public Builder projectName(@Nullable String projectName) {
            this.projectName = Codegen.ofNullable(projectName);
            return this;
        }
        public Builder properties(@Nullable Output<ProjectPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ProjectPropertiesArgs properties) {
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
        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ProjectArgs build() {
            return new ProjectArgs(eTag, location, projectName, properties, resourceGroupName, tags);
        }
    }
}
