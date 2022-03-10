// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.ActingUserResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.ServingConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class VersionResponse {
    /**
     * The configuration for the behavior of the site. This configuration exists in the [`firebase.json`](https://firebase.google.com/docs/cli/#the_firebasejson_file) file.
     * 
     */
    private final ServingConfigResponse config;
    /**
     * The time at which the version was created.
     * 
     */
    private final String createTime;
    /**
     * Identifies the user who created the version.
     * 
     */
    private final ActingUserResponse createUser;
    /**
     * The time at which the version was `DELETED`.
     * 
     */
    private final String deleteTime;
    /**
     * Identifies the user who `DELETED` the version.
     * 
     */
    private final ActingUserResponse deleteUser;
    /**
     * The total number of files associated with the version. This value is calculated after a version is `FINALIZED`.
     * 
     */
    private final String fileCount;
    /**
     * The time at which the version was `FINALIZED`.
     * 
     */
    private final String finalizeTime;
    /**
     * Identifies the user who `FINALIZED` the version.
     * 
     */
    private final ActingUserResponse finalizeUser;
    /**
     * The labels used for extra metadata and/or filtering.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The fully-qualified resource name for the version, in the format: sites/ SITE_ID/versions/VERSION_ID This name is provided in the response body when you call [`CreateVersion`](sites.versions/create).
     * 
     */
    private final String name;
    /**
     * The deploy status of the version. For a successful deploy, call [`CreateVersion`](sites.versions/create) to make a new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the version, then [update](sites.versions/patch) the version to the `FINALIZED` status. Note that if you leave the version in the `CREATED` state for more than 12 hours, the system will automatically mark the version as `ABANDONED`. You can also change the status of a version to `DELETED` by calling [`DeleteVersion`](sites.versions/delete).
     * 
     */
    private final String status;
    /**
     * The total stored bytesize of the version. This value is calculated after a version is `FINALIZED`.
     * 
     */
    private final String versionBytes;

    @OutputCustomType.Constructor
    private VersionResponse(
        @OutputCustomType.Parameter("config") ServingConfigResponse config,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("createUser") ActingUserResponse createUser,
        @OutputCustomType.Parameter("deleteTime") String deleteTime,
        @OutputCustomType.Parameter("deleteUser") ActingUserResponse deleteUser,
        @OutputCustomType.Parameter("fileCount") String fileCount,
        @OutputCustomType.Parameter("finalizeTime") String finalizeTime,
        @OutputCustomType.Parameter("finalizeUser") ActingUserResponse finalizeUser,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("versionBytes") String versionBytes) {
        this.config = config;
        this.createTime = createTime;
        this.createUser = createUser;
        this.deleteTime = deleteTime;
        this.deleteUser = deleteUser;
        this.fileCount = fileCount;
        this.finalizeTime = finalizeTime;
        this.finalizeUser = finalizeUser;
        this.labels = labels;
        this.name = name;
        this.status = status;
        this.versionBytes = versionBytes;
    }

    /**
     * The configuration for the behavior of the site. This configuration exists in the [`firebase.json`](https://firebase.google.com/docs/cli/#the_firebasejson_file) file.
     * 
    */
    public ServingConfigResponse getConfig() {
        return this.config;
    }
    /**
     * The time at which the version was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Identifies the user who created the version.
     * 
    */
    public ActingUserResponse getCreateUser() {
        return this.createUser;
    }
    /**
     * The time at which the version was `DELETED`.
     * 
    */
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * Identifies the user who `DELETED` the version.
     * 
    */
    public ActingUserResponse getDeleteUser() {
        return this.deleteUser;
    }
    /**
     * The total number of files associated with the version. This value is calculated after a version is `FINALIZED`.
     * 
    */
    public String getFileCount() {
        return this.fileCount;
    }
    /**
     * The time at which the version was `FINALIZED`.
     * 
    */
    public String getFinalizeTime() {
        return this.finalizeTime;
    }
    /**
     * Identifies the user who `FINALIZED` the version.
     * 
    */
    public ActingUserResponse getFinalizeUser() {
        return this.finalizeUser;
    }
    /**
     * The labels used for extra metadata and/or filtering.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The fully-qualified resource name for the version, in the format: sites/ SITE_ID/versions/VERSION_ID This name is provided in the response body when you call [`CreateVersion`](sites.versions/create).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The deploy status of the version. For a successful deploy, call [`CreateVersion`](sites.versions/create) to make a new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the version, then [update](sites.versions/patch) the version to the `FINALIZED` status. Note that if you leave the version in the `CREATED` state for more than 12 hours, the system will automatically mark the version as `ABANDONED`. You can also change the status of a version to `DELETED` by calling [`DeleteVersion`](sites.versions/delete).
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The total stored bytesize of the version. This value is calculated after a version is `FINALIZED`.
     * 
    */
    public String getVersionBytes() {
        return this.versionBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServingConfigResponse config;
        private String createTime;
        private ActingUserResponse createUser;
        private String deleteTime;
        private ActingUserResponse deleteUser;
        private String fileCount;
        private String finalizeTime;
        private ActingUserResponse finalizeUser;
        private Map<String,String> labels;
        private String name;
        private String status;
        private String versionBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.createUser = defaults.createUser;
    	      this.deleteTime = defaults.deleteTime;
    	      this.deleteUser = defaults.deleteUser;
    	      this.fileCount = defaults.fileCount;
    	      this.finalizeTime = defaults.finalizeTime;
    	      this.finalizeUser = defaults.finalizeUser;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.versionBytes = defaults.versionBytes;
        }

        public Builder config(ServingConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder createUser(ActingUserResponse createUser) {
            this.createUser = Objects.requireNonNull(createUser);
            return this;
        }

        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder deleteUser(ActingUserResponse deleteUser) {
            this.deleteUser = Objects.requireNonNull(deleteUser);
            return this;
        }

        public Builder fileCount(String fileCount) {
            this.fileCount = Objects.requireNonNull(fileCount);
            return this;
        }

        public Builder finalizeTime(String finalizeTime) {
            this.finalizeTime = Objects.requireNonNull(finalizeTime);
            return this;
        }

        public Builder finalizeUser(ActingUserResponse finalizeUser) {
            this.finalizeUser = Objects.requireNonNull(finalizeUser);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder versionBytes(String versionBytes) {
            this.versionBytes = Objects.requireNonNull(versionBytes);
            return this;
        }
        public VersionResponse build() {
            return new VersionResponse(config, createTime, createUser, deleteTime, deleteUser, fileCount, finalizeTime, finalizeUser, labels, name, status, versionBytes);
        }
    }
}
