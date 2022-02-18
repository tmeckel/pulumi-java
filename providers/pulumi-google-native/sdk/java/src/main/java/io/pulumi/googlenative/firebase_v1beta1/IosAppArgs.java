// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IosAppArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosAppArgs Empty = new IosAppArgs();

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @InputImport(name="appId")
    private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
     * 
     */
    @InputImport(name="appStoreId")
    private final @Nullable Input<String> appStoreId;

    public Input<String> getAppStoreId() {
        return this.appStoreId == null ? Input.empty() : this.appStoreId;
    }

    /**
     * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
     * 
     */
    @InputImport(name="bundleId")
    private final @Nullable Input<String> bundleId;

    public Input<String> getBundleId() {
        return this.bundleId == null ? Input.empty() : this.bundleId;
    }

    /**
     * The user-assigned display name for the `IosApp`.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `IosApp`.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     * 
     */
    @InputImport(name="teamId")
    private final @Nullable Input<String> teamId;

    public Input<String> getTeamId() {
        return this.teamId == null ? Input.empty() : this.teamId;
    }

    public IosAppArgs(
        @Nullable Input<String> appId,
        @Nullable Input<String> appStoreId,
        @Nullable Input<String> bundleId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> teamId) {
        this.appId = appId;
        this.appStoreId = appStoreId;
        this.bundleId = bundleId;
        this.displayName = displayName;
        this.name = name;
        this.project = project;
        this.teamId = teamId;
    }

    private IosAppArgs() {
        this.appId = Input.empty();
        this.appStoreId = Input.empty();
        this.bundleId = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.teamId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<String> appStoreId;
        private @Nullable Input<String> bundleId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> teamId;

        public Builder() {
    	      // Empty
        }

        public Builder(IosAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appStoreId = defaults.appStoreId;
    	      this.bundleId = defaults.bundleId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.teamId = defaults.teamId;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder setAppStoreId(@Nullable Input<String> appStoreId) {
            this.appStoreId = appStoreId;
            return this;
        }

        public Builder setAppStoreId(@Nullable String appStoreId) {
            this.appStoreId = Input.ofNullable(appStoreId);
            return this;
        }

        public Builder setBundleId(@Nullable Input<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder setBundleId(@Nullable String bundleId) {
            this.bundleId = Input.ofNullable(bundleId);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setTeamId(@Nullable Input<String> teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder setTeamId(@Nullable String teamId) {
            this.teamId = Input.ofNullable(teamId);
            return this;
        }

        public IosAppArgs build() {
            return new IosAppArgs(appId, appStoreId, bundleId, displayName, name, project, teamId);
        }
    }
}
