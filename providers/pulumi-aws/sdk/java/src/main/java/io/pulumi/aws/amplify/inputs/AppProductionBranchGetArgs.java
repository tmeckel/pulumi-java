// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppProductionBranchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppProductionBranchGetArgs Empty = new AppProductionBranchGetArgs();

    /**
     * The branch name for the production branch.
     * 
     */
    @InputImport(name="branchName")
      private final @Nullable Input<String> branchName;

    public Input<String> getBranchName() {
        return this.branchName == null ? Input.empty() : this.branchName;
    }

    /**
     * The last deploy time of the production branch.
     * 
     */
    @InputImport(name="lastDeployTime")
      private final @Nullable Input<String> lastDeployTime;

    public Input<String> getLastDeployTime() {
        return this.lastDeployTime == null ? Input.empty() : this.lastDeployTime;
    }

    /**
     * The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The thumbnail URL for the production branch.
     * 
     */
    @InputImport(name="thumbnailUrl")
      private final @Nullable Input<String> thumbnailUrl;

    public Input<String> getThumbnailUrl() {
        return this.thumbnailUrl == null ? Input.empty() : this.thumbnailUrl;
    }

    public AppProductionBranchGetArgs(
        @Nullable Input<String> branchName,
        @Nullable Input<String> lastDeployTime,
        @Nullable Input<String> status,
        @Nullable Input<String> thumbnailUrl) {
        this.branchName = branchName;
        this.lastDeployTime = lastDeployTime;
        this.status = status;
        this.thumbnailUrl = thumbnailUrl;
    }

    private AppProductionBranchGetArgs() {
        this.branchName = Input.empty();
        this.lastDeployTime = Input.empty();
        this.status = Input.empty();
        this.thumbnailUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppProductionBranchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branchName;
        private @Nullable Input<String> lastDeployTime;
        private @Nullable Input<String> status;
        private @Nullable Input<String> thumbnailUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppProductionBranchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.lastDeployTime = defaults.lastDeployTime;
    	      this.status = defaults.status;
    	      this.thumbnailUrl = defaults.thumbnailUrl;
        }

        public Builder branchName(@Nullable Input<String> branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder branchName(@Nullable String branchName) {
            this.branchName = Input.ofNullable(branchName);
            return this;
        }

        public Builder lastDeployTime(@Nullable Input<String> lastDeployTime) {
            this.lastDeployTime = lastDeployTime;
            return this;
        }

        public Builder lastDeployTime(@Nullable String lastDeployTime) {
            this.lastDeployTime = Input.ofNullable(lastDeployTime);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder thumbnailUrl(@Nullable Input<String> thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public Builder thumbnailUrl(@Nullable String thumbnailUrl) {
            this.thumbnailUrl = Input.ofNullable(thumbnailUrl);
            return this;
        }
        public AppProductionBranchGetArgs build() {
            return new AppProductionBranchGetArgs(branchName, lastDeployTime, status, thumbnailUrl);
        }
    }
}
