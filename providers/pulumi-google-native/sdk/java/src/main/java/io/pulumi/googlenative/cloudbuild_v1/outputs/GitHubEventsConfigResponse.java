// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.PullRequestFilterResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.PushFilterResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GitHubEventsConfigResponse {
    /**
     * Optional. The resource name of the github enterprise config that should be applied to this installation. For example: "projects/{$project_id}/githubEnterpriseConfigs/{$config_id}"
     * 
     */
    private final String enterpriseConfigResourceName;
    /**
     * The installationID that emits the GitHub event.
     * 
     */
    private final String installationId;
    /**
     * Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is "cloud-builders".
     * 
     */
    private final String name;
    /**
     * Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform".
     * 
     */
    private final String owner;
    /**
     * filter to match changes in pull requests.
     * 
     */
    private final PullRequestFilterResponse pullRequest;
    /**
     * filter to match changes in refs like branches, tags.
     * 
     */
    private final PushFilterResponse push;

    @OutputCustomType.Constructor({"enterpriseConfigResourceName","installationId","name","owner","pullRequest","push"})
    private GitHubEventsConfigResponse(
        String enterpriseConfigResourceName,
        String installationId,
        String name,
        String owner,
        PullRequestFilterResponse pullRequest,
        PushFilterResponse push) {
        this.enterpriseConfigResourceName = Objects.requireNonNull(enterpriseConfigResourceName);
        this.installationId = Objects.requireNonNull(installationId);
        this.name = Objects.requireNonNull(name);
        this.owner = Objects.requireNonNull(owner);
        this.pullRequest = Objects.requireNonNull(pullRequest);
        this.push = Objects.requireNonNull(push);
    }

    /**
     * Optional. The resource name of the github enterprise config that should be applied to this installation. For example: "projects/{$project_id}/githubEnterpriseConfigs/{$config_id}"
     * 
     */
    public String getEnterpriseConfigResourceName() {
        return this.enterpriseConfigResourceName;
    }
    /**
     * The installationID that emits the GitHub event.
     * 
     */
    public String getInstallationId() {
        return this.installationId;
    }
    /**
     * Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is "cloud-builders".
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform".
     * 
     */
    public String getOwner() {
        return this.owner;
    }
    /**
     * filter to match changes in pull requests.
     * 
     */
    public PullRequestFilterResponse getPullRequest() {
        return this.pullRequest;
    }
    /**
     * filter to match changes in refs like branches, tags.
     * 
     */
    public PushFilterResponse getPush() {
        return this.push;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubEventsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String enterpriseConfigResourceName;
        private String installationId;
        private String name;
        private String owner;
        private PullRequestFilterResponse pullRequest;
        private PushFilterResponse push;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubEventsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enterpriseConfigResourceName = defaults.enterpriseConfigResourceName;
    	      this.installationId = defaults.installationId;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.pullRequest = defaults.pullRequest;
    	      this.push = defaults.push;
        }

        public Builder setEnterpriseConfigResourceName(String enterpriseConfigResourceName) {
            this.enterpriseConfigResourceName = Objects.requireNonNull(enterpriseConfigResourceName);
            return this;
        }

        public Builder setInstallationId(String installationId) {
            this.installationId = Objects.requireNonNull(installationId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder setPullRequest(PullRequestFilterResponse pullRequest) {
            this.pullRequest = Objects.requireNonNull(pullRequest);
            return this;
        }

        public Builder setPush(PushFilterResponse push) {
            this.push = Objects.requireNonNull(push);
            return this;
        }

        public GitHubEventsConfigResponse build() {
            return new GitHubEventsConfigResponse(enterpriseConfigResourceName, installationId, name, owner, pullRequest, push);
        }
    }
}
