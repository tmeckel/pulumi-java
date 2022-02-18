// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitHubEnterpriseSecretsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GithubEnterpriseConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GithubEnterpriseConfigArgs Empty = new GithubEnterpriseConfigArgs();

    /**
     * The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    @InputImport(name="appId", required=true)
    private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * Name to display for this config.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="gheConfigId")
    private final @Nullable Input<String> gheConfigId;

    public Input<String> getGheConfigId() {
        return this.gheConfigId == null ? Input.empty() : this.gheConfigId;
    }

    /**
     * The URL of the github enterprise host the configuration is for.
     * 
     */
    @InputImport(name="hostUrl")
    private final @Nullable Input<String> hostUrl;

    public Input<String> getHostUrl() {
        return this.hostUrl == null ? Input.empty() : this.hostUrl;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. The full resource name for the GitHubEnterpriseConfig For example: "projects/{$project_id}/githubEnterpriseConfigs/{$config_id}"
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    @InputImport(name="peeredNetwork")
    private final @Nullable Input<String> peeredNetwork;

    public Input<String> getPeeredNetwork() {
        return this.peeredNetwork == null ? Input.empty() : this.peeredNetwork;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="projectId")
    private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    /**
     * Names of secrets in Secret Manager.
     * 
     */
    @InputImport(name="secrets")
    private final @Nullable Input<GitHubEnterpriseSecretsArgs> secrets;

    public Input<GitHubEnterpriseSecretsArgs> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    /**
     * Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    @InputImport(name="sslCa")
    private final @Nullable Input<String> sslCa;

    public Input<String> getSslCa() {
        return this.sslCa == null ? Input.empty() : this.sslCa;
    }

    /**
     * The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    @InputImport(name="webhookKey")
    private final @Nullable Input<String> webhookKey;

    public Input<String> getWebhookKey() {
        return this.webhookKey == null ? Input.empty() : this.webhookKey;
    }

    public GithubEnterpriseConfigArgs(
        Input<String> appId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> gheConfigId,
        @Nullable Input<String> hostUrl,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> peeredNetwork,
        @Nullable Input<String> project,
        @Nullable Input<String> projectId,
        @Nullable Input<GitHubEnterpriseSecretsArgs> secrets,
        @Nullable Input<String> sslCa,
        @Nullable Input<String> webhookKey) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.displayName = displayName;
        this.gheConfigId = gheConfigId;
        this.hostUrl = hostUrl;
        this.location = location;
        this.name = name;
        this.peeredNetwork = peeredNetwork;
        this.project = project;
        this.projectId = projectId;
        this.secrets = secrets;
        this.sslCa = sslCa;
        this.webhookKey = webhookKey;
    }

    private GithubEnterpriseConfigArgs() {
        this.appId = Input.empty();
        this.displayName = Input.empty();
        this.gheConfigId = Input.empty();
        this.hostUrl = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.peeredNetwork = Input.empty();
        this.project = Input.empty();
        this.projectId = Input.empty();
        this.secrets = Input.empty();
        this.sslCa = Input.empty();
        this.webhookKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GithubEnterpriseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> gheConfigId;
        private @Nullable Input<String> hostUrl;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> peeredNetwork;
        private @Nullable Input<String> project;
        private @Nullable Input<String> projectId;
        private @Nullable Input<GitHubEnterpriseSecretsArgs> secrets;
        private @Nullable Input<String> sslCa;
        private @Nullable Input<String> webhookKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GithubEnterpriseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.gheConfigId = defaults.gheConfigId;
    	      this.hostUrl = defaults.hostUrl;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peeredNetwork = defaults.peeredNetwork;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
    	      this.secrets = defaults.secrets;
    	      this.sslCa = defaults.sslCa;
    	      this.webhookKey = defaults.webhookKey;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
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

        public Builder setGheConfigId(@Nullable Input<String> gheConfigId) {
            this.gheConfigId = gheConfigId;
            return this;
        }

        public Builder setGheConfigId(@Nullable String gheConfigId) {
            this.gheConfigId = Input.ofNullable(gheConfigId);
            return this;
        }

        public Builder setHostUrl(@Nullable Input<String> hostUrl) {
            this.hostUrl = hostUrl;
            return this;
        }

        public Builder setHostUrl(@Nullable String hostUrl) {
            this.hostUrl = Input.ofNullable(hostUrl);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPeeredNetwork(@Nullable Input<String> peeredNetwork) {
            this.peeredNetwork = peeredNetwork;
            return this;
        }

        public Builder setPeeredNetwork(@Nullable String peeredNetwork) {
            this.peeredNetwork = Input.ofNullable(peeredNetwork);
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

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }

        public Builder setSecrets(@Nullable Input<GitHubEnterpriseSecretsArgs> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setSecrets(@Nullable GitHubEnterpriseSecretsArgs secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }

        public Builder setSslCa(@Nullable Input<String> sslCa) {
            this.sslCa = sslCa;
            return this;
        }

        public Builder setSslCa(@Nullable String sslCa) {
            this.sslCa = Input.ofNullable(sslCa);
            return this;
        }

        public Builder setWebhookKey(@Nullable Input<String> webhookKey) {
            this.webhookKey = webhookKey;
            return this;
        }

        public Builder setWebhookKey(@Nullable String webhookKey) {
            this.webhookKey = Input.ofNullable(webhookKey);
            return this;
        }

        public GithubEnterpriseConfigArgs build() {
            return new GithubEnterpriseConfigArgs(appId, displayName, gheConfigId, hostUrl, location, name, peeredNetwork, project, projectId, secrets, sslCa, webhookKey);
        }
    }
}
