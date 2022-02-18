// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * The share setting for reservations and sole tenancy node groups.
 * 
 */
public final class ShareSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShareSettingsResponse Empty = new ShareSettingsResponse();

    /**
     * A map of folder id and folder config to specify consumer projects for this shared-reservation. This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id should be a string of number, and without "folders/" prefix.
     * 
     */
    @InputImport(name="folderMap", required=true)
    private final Map<String,String> folderMap;

    public Map<String,String> getFolderMap() {
        return this.folderMap;
    }

    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    @InputImport(name="projectMap", required=true)
    private final Map<String,String> projectMap;

    public Map<String,String> getProjectMap() {
        return this.projectMap;
    }

    /**
     * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    @InputImport(name="projects", required=true)
    private final List<String> projects;

    public List<String> getProjects() {
        return this.projects;
    }

    /**
     * Type of sharing for this shared-reservation
     * 
     */
    @InputImport(name="shareType", required=true)
    private final String shareType;

    public String getShareType() {
        return this.shareType;
    }

    public ShareSettingsResponse(
        Map<String,String> folderMap,
        Map<String,String> projectMap,
        List<String> projects,
        String shareType) {
        this.folderMap = Objects.requireNonNull(folderMap, "expected parameter 'folderMap' to be non-null");
        this.projectMap = Objects.requireNonNull(projectMap, "expected parameter 'projectMap' to be non-null");
        this.projects = Objects.requireNonNull(projects, "expected parameter 'projects' to be non-null");
        this.shareType = Objects.requireNonNull(shareType, "expected parameter 'shareType' to be non-null");
    }

    private ShareSettingsResponse() {
        this.folderMap = Map.of();
        this.projectMap = Map.of();
        this.projects = List.of();
        this.shareType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> folderMap;
        private Map<String,String> projectMap;
        private List<String> projects;
        private String shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderMap = defaults.folderMap;
    	      this.projectMap = defaults.projectMap;
    	      this.projects = defaults.projects;
    	      this.shareType = defaults.shareType;
        }

        public Builder setFolderMap(Map<String,String> folderMap) {
            this.folderMap = Objects.requireNonNull(folderMap);
            return this;
        }

        public Builder setProjectMap(Map<String,String> projectMap) {
            this.projectMap = Objects.requireNonNull(projectMap);
            return this;
        }

        public Builder setProjects(List<String> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }

        public Builder setShareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }

        public ShareSettingsResponse build() {
            return new ShareSettingsResponse(folderMap, projectMap, projects, shareType);
        }
    }
}
