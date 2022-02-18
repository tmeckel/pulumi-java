// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagArgs Empty = new PolicyTagArgs();

    /**
     * Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User-defined name of this policy tag. The name can't start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Resource name of this policy tag's parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag, and, for "Geolocation", this field is empty.
     * 
     */
    @InputImport(name="parentPolicyTag")
    private final @Nullable Input<String> parentPolicyTag;

    public Input<String> getParentPolicyTag() {
        return this.parentPolicyTag == null ? Input.empty() : this.parentPolicyTag;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="taxonomyId", required=true)
    private final Input<String> taxonomyId;

    public Input<String> getTaxonomyId() {
        return this.taxonomyId;
    }

    public PolicyTagArgs(
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> location,
        @Nullable Input<String> parentPolicyTag,
        @Nullable Input<String> project,
        Input<String> taxonomyId) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.location = location;
        this.parentPolicyTag = parentPolicyTag;
        this.project = project;
        this.taxonomyId = Objects.requireNonNull(taxonomyId, "expected parameter 'taxonomyId' to be non-null");
    }

    private PolicyTagArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.parentPolicyTag = Input.empty();
        this.project = Input.empty();
        this.taxonomyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> parentPolicyTag;
        private @Nullable Input<String> project;
        private Input<String> taxonomyId;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.parentPolicyTag = defaults.parentPolicyTag;
    	      this.project = defaults.project;
    	      this.taxonomyId = defaults.taxonomyId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setParentPolicyTag(@Nullable Input<String> parentPolicyTag) {
            this.parentPolicyTag = parentPolicyTag;
            return this;
        }

        public Builder setParentPolicyTag(@Nullable String parentPolicyTag) {
            this.parentPolicyTag = Input.ofNullable(parentPolicyTag);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTaxonomyId(Input<String> taxonomyId) {
            this.taxonomyId = Objects.requireNonNull(taxonomyId);
            return this;
        }

        public Builder setTaxonomyId(String taxonomyId) {
            this.taxonomyId = Input.of(Objects.requireNonNull(taxonomyId));
            return this;
        }

        public PolicyTagArgs build() {
            return new PolicyTagArgs(description, displayName, location, parentPolicyTag, project, taxonomyId);
        }
    }
}
