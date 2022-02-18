// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ShareSettingsShareType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The share setting for reservations and sole tenancy node groups.
 * 
 */
public final class ShareSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShareSettingsArgs Empty = new ShareSettingsArgs();

    /**
     * A map of folder id and folder config to specify consumer projects for this shared-reservation. This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id should be a string of number, and without "folders/" prefix.
     * 
     */
    @InputImport(name="folderMap")
    private final @Nullable Input<Map<String,String>> folderMap;

    public Input<Map<String,String>> getFolderMap() {
        return this.folderMap == null ? Input.empty() : this.folderMap;
    }

    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    @InputImport(name="projectMap")
    private final @Nullable Input<Map<String,String>> projectMap;

    public Input<Map<String,String>> getProjectMap() {
        return this.projectMap == null ? Input.empty() : this.projectMap;
    }

    /**
     * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    @InputImport(name="projects")
    private final @Nullable Input<List<String>> projects;

    public Input<List<String>> getProjects() {
        return this.projects == null ? Input.empty() : this.projects;
    }

    /**
     * Type of sharing for this shared-reservation
     * 
     */
    @InputImport(name="shareType")
    private final @Nullable Input<ShareSettingsShareType> shareType;

    public Input<ShareSettingsShareType> getShareType() {
        return this.shareType == null ? Input.empty() : this.shareType;
    }

    public ShareSettingsArgs(
        @Nullable Input<Map<String,String>> folderMap,
        @Nullable Input<Map<String,String>> projectMap,
        @Nullable Input<List<String>> projects,
        @Nullable Input<ShareSettingsShareType> shareType) {
        this.folderMap = folderMap;
        this.projectMap = projectMap;
        this.projects = projects;
        this.shareType = shareType;
    }

    private ShareSettingsArgs() {
        this.folderMap = Input.empty();
        this.projectMap = Input.empty();
        this.projects = Input.empty();
        this.shareType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> folderMap;
        private @Nullable Input<Map<String,String>> projectMap;
        private @Nullable Input<List<String>> projects;
        private @Nullable Input<ShareSettingsShareType> shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderMap = defaults.folderMap;
    	      this.projectMap = defaults.projectMap;
    	      this.projects = defaults.projects;
    	      this.shareType = defaults.shareType;
        }

        public Builder setFolderMap(@Nullable Input<Map<String,String>> folderMap) {
            this.folderMap = folderMap;
            return this;
        }

        public Builder setFolderMap(@Nullable Map<String,String> folderMap) {
            this.folderMap = Input.ofNullable(folderMap);
            return this;
        }

        public Builder setProjectMap(@Nullable Input<Map<String,String>> projectMap) {
            this.projectMap = projectMap;
            return this;
        }

        public Builder setProjectMap(@Nullable Map<String,String> projectMap) {
            this.projectMap = Input.ofNullable(projectMap);
            return this;
        }

        public Builder setProjects(@Nullable Input<List<String>> projects) {
            this.projects = projects;
            return this;
        }

        public Builder setProjects(@Nullable List<String> projects) {
            this.projects = Input.ofNullable(projects);
            return this;
        }

        public Builder setShareType(@Nullable Input<ShareSettingsShareType> shareType) {
            this.shareType = shareType;
            return this;
        }

        public Builder setShareType(@Nullable ShareSettingsShareType shareType) {
            this.shareType = Input.ofNullable(shareType);
            return this;
        }

        public ShareSettingsArgs build() {
            return new ShareSettingsArgs(folderMap, projectMap, projects, shareType);
        }
    }
}
