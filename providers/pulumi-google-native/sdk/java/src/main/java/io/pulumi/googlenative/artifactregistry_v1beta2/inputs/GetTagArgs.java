// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagArgs Empty = new GetTagArgs();

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="packageId", required=true)
    private final String packageId;

    public String getPackageId() {
        return this.packageId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="repositoryId", required=true)
    private final String repositoryId;

    public String getRepositoryId() {
        return this.repositoryId;
    }

    @InputImport(name="tagId", required=true)
    private final String tagId;

    public String getTagId() {
        return this.tagId;
    }

    public GetTagArgs(
        String location,
        String packageId,
        @Nullable String project,
        String repositoryId,
        String tagId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.packageId = Objects.requireNonNull(packageId, "expected parameter 'packageId' to be non-null");
        this.project = project;
        this.repositoryId = Objects.requireNonNull(repositoryId, "expected parameter 'repositoryId' to be non-null");
        this.tagId = Objects.requireNonNull(tagId, "expected parameter 'tagId' to be non-null");
    }

    private GetTagArgs() {
        this.location = null;
        this.packageId = null;
        this.project = null;
        this.repositoryId = null;
        this.tagId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String packageId;
        private @Nullable String project;
        private String repositoryId;
        private String tagId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.packageId = defaults.packageId;
    	      this.project = defaults.project;
    	      this.repositoryId = defaults.repositoryId;
    	      this.tagId = defaults.tagId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setPackageId(String packageId) {
            this.packageId = Objects.requireNonNull(packageId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }

        public Builder setTagId(String tagId) {
            this.tagId = Objects.requireNonNull(tagId);
            return this;
        }

        public GetTagArgs build() {
            return new GetTagArgs(location, packageId, project, repositoryId, tagId);
        }
    }
}
