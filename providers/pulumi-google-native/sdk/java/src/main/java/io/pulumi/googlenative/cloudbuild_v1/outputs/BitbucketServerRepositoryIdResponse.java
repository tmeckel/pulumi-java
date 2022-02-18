// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BitbucketServerRepositoryIdResponse {
    /**
     * Identifier for the project storing the repository.
     * 
     */
    private final String projectKey;
    /**
     * Identifier for the repository.
     * 
     */
    private final String repoSlug;
    /**
     * The ID of the webhook that was created for receiving events from this repo. We only create and manage a single webhook for each repo.
     * 
     */
    private final Integer webhookId;

    @OutputCustomType.Constructor({"projectKey","repoSlug","webhookId"})
    private BitbucketServerRepositoryIdResponse(
        String projectKey,
        String repoSlug,
        Integer webhookId) {
        this.projectKey = Objects.requireNonNull(projectKey);
        this.repoSlug = Objects.requireNonNull(repoSlug);
        this.webhookId = Objects.requireNonNull(webhookId);
    }

    /**
     * Identifier for the project storing the repository.
     * 
     */
    public String getProjectKey() {
        return this.projectKey;
    }
    /**
     * Identifier for the repository.
     * 
     */
    public String getRepoSlug() {
        return this.repoSlug;
    }
    /**
     * The ID of the webhook that was created for receiving events from this repo. We only create and manage a single webhook for each repo.
     * 
     */
    public Integer getWebhookId() {
        return this.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerRepositoryIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectKey;
        private String repoSlug;
        private Integer webhookId;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerRepositoryIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectKey = defaults.projectKey;
    	      this.repoSlug = defaults.repoSlug;
    	      this.webhookId = defaults.webhookId;
        }

        public Builder setProjectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
            return this;
        }

        public Builder setRepoSlug(String repoSlug) {
            this.repoSlug = Objects.requireNonNull(repoSlug);
            return this;
        }

        public Builder setWebhookId(Integer webhookId) {
            this.webhookId = Objects.requireNonNull(webhookId);
            return this;
        }

        public BitbucketServerRepositoryIdResponse build() {
            return new BitbucketServerRepositoryIdResponse(projectKey, repoSlug, webhookId);
        }
    }
}
