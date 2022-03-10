// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementConfigSyncGitArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementConfigSyncGitArgs Empty = new FeatureMembershipConfigmanagementConfigSyncGitArgs();

    @InputImport(name="gcpServiceAccountEmail")
      private final @Nullable Input<String> gcpServiceAccountEmail;

    public Input<String> getGcpServiceAccountEmail() {
        return this.gcpServiceAccountEmail == null ? Input.empty() : this.gcpServiceAccountEmail;
    }

    /**
     * URL for the HTTPS proxy to be used when communicating with the Git repo.
     * 
     */
    @InputImport(name="httpsProxy")
      private final @Nullable Input<String> httpsProxy;

    public Input<String> getHttpsProxy() {
        return this.httpsProxy == null ? Input.empty() : this.httpsProxy;
    }

    /**
     * The path within the Git repository that represents the top level of the repo to sync. Default: the root directory of the repository.
     * 
     */
    @InputImport(name="policyDir")
      private final @Nullable Input<String> policyDir;

    public Input<String> getPolicyDir() {
        return this.policyDir == null ? Input.empty() : this.policyDir;
    }

    /**
     * Type of secret configured for access to the Git repo.
     * 
     */
    @InputImport(name="secretType")
      private final @Nullable Input<String> secretType;

    public Input<String> getSecretType() {
        return this.secretType == null ? Input.empty() : this.secretType;
    }

    /**
     * The branch of the repository to sync from. Default: master.
     * 
     */
    @InputImport(name="syncBranch")
      private final @Nullable Input<String> syncBranch;

    public Input<String> getSyncBranch() {
        return this.syncBranch == null ? Input.empty() : this.syncBranch;
    }

    /**
     * The URL of the Git repository to use as the source of truth.
     * 
     */
    @InputImport(name="syncRepo")
      private final @Nullable Input<String> syncRepo;

    public Input<String> getSyncRepo() {
        return this.syncRepo == null ? Input.empty() : this.syncRepo;
    }

    /**
     * Git revision (tag or hash) to check out. Default HEAD.
     * 
     */
    @InputImport(name="syncRev")
      private final @Nullable Input<String> syncRev;

    public Input<String> getSyncRev() {
        return this.syncRev == null ? Input.empty() : this.syncRev;
    }

    /**
     * Period in seconds between consecutive syncs. Default: 15.
     * 
     */
    @InputImport(name="syncWaitSecs")
      private final @Nullable Input<String> syncWaitSecs;

    public Input<String> getSyncWaitSecs() {
        return this.syncWaitSecs == null ? Input.empty() : this.syncWaitSecs;
    }

    public FeatureMembershipConfigmanagementConfigSyncGitArgs(
        @Nullable Input<String> gcpServiceAccountEmail,
        @Nullable Input<String> httpsProxy,
        @Nullable Input<String> policyDir,
        @Nullable Input<String> secretType,
        @Nullable Input<String> syncBranch,
        @Nullable Input<String> syncRepo,
        @Nullable Input<String> syncRev,
        @Nullable Input<String> syncWaitSecs) {
        this.gcpServiceAccountEmail = gcpServiceAccountEmail;
        this.httpsProxy = httpsProxy;
        this.policyDir = policyDir;
        this.secretType = secretType;
        this.syncBranch = syncBranch;
        this.syncRepo = syncRepo;
        this.syncRev = syncRev;
        this.syncWaitSecs = syncWaitSecs;
    }

    private FeatureMembershipConfigmanagementConfigSyncGitArgs() {
        this.gcpServiceAccountEmail = Input.empty();
        this.httpsProxy = Input.empty();
        this.policyDir = Input.empty();
        this.secretType = Input.empty();
        this.syncBranch = Input.empty();
        this.syncRepo = Input.empty();
        this.syncRev = Input.empty();
        this.syncWaitSecs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementConfigSyncGitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> gcpServiceAccountEmail;
        private @Nullable Input<String> httpsProxy;
        private @Nullable Input<String> policyDir;
        private @Nullable Input<String> secretType;
        private @Nullable Input<String> syncBranch;
        private @Nullable Input<String> syncRepo;
        private @Nullable Input<String> syncRev;
        private @Nullable Input<String> syncWaitSecs;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementConfigSyncGitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpServiceAccountEmail = defaults.gcpServiceAccountEmail;
    	      this.httpsProxy = defaults.httpsProxy;
    	      this.policyDir = defaults.policyDir;
    	      this.secretType = defaults.secretType;
    	      this.syncBranch = defaults.syncBranch;
    	      this.syncRepo = defaults.syncRepo;
    	      this.syncRev = defaults.syncRev;
    	      this.syncWaitSecs = defaults.syncWaitSecs;
        }

        public Builder gcpServiceAccountEmail(@Nullable Input<String> gcpServiceAccountEmail) {
            this.gcpServiceAccountEmail = gcpServiceAccountEmail;
            return this;
        }

        public Builder gcpServiceAccountEmail(@Nullable String gcpServiceAccountEmail) {
            this.gcpServiceAccountEmail = Input.ofNullable(gcpServiceAccountEmail);
            return this;
        }

        public Builder httpsProxy(@Nullable Input<String> httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }

        public Builder httpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = Input.ofNullable(httpsProxy);
            return this;
        }

        public Builder policyDir(@Nullable Input<String> policyDir) {
            this.policyDir = policyDir;
            return this;
        }

        public Builder policyDir(@Nullable String policyDir) {
            this.policyDir = Input.ofNullable(policyDir);
            return this;
        }

        public Builder secretType(@Nullable Input<String> secretType) {
            this.secretType = secretType;
            return this;
        }

        public Builder secretType(@Nullable String secretType) {
            this.secretType = Input.ofNullable(secretType);
            return this;
        }

        public Builder syncBranch(@Nullable Input<String> syncBranch) {
            this.syncBranch = syncBranch;
            return this;
        }

        public Builder syncBranch(@Nullable String syncBranch) {
            this.syncBranch = Input.ofNullable(syncBranch);
            return this;
        }

        public Builder syncRepo(@Nullable Input<String> syncRepo) {
            this.syncRepo = syncRepo;
            return this;
        }

        public Builder syncRepo(@Nullable String syncRepo) {
            this.syncRepo = Input.ofNullable(syncRepo);
            return this;
        }

        public Builder syncRev(@Nullable Input<String> syncRev) {
            this.syncRev = syncRev;
            return this;
        }

        public Builder syncRev(@Nullable String syncRev) {
            this.syncRev = Input.ofNullable(syncRev);
            return this;
        }

        public Builder syncWaitSecs(@Nullable Input<String> syncWaitSecs) {
            this.syncWaitSecs = syncWaitSecs;
            return this;
        }

        public Builder syncWaitSecs(@Nullable String syncWaitSecs) {
            this.syncWaitSecs = Input.ofNullable(syncWaitSecs);
            return this;
        }
        public FeatureMembershipConfigmanagementConfigSyncGitArgs build() {
            return new FeatureMembershipConfigmanagementConfigSyncGitArgs(gcpServiceAccountEmail, httpsProxy, policyDir, secretType, syncBranch, syncRepo, syncRev, syncWaitSecs);
        }
    }
}
