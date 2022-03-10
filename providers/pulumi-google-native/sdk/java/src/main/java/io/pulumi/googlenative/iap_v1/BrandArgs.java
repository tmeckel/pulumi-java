// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrandArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrandArgs Empty = new BrandArgs();

    /**
     * Application name displayed on OAuth consent screen.
     * 
     */
    @InputImport(name="applicationTitle")
      private final @Nullable Input<String> applicationTitle;

    public Input<String> getApplicationTitle() {
        return this.applicationTitle == null ? Input.empty() : this.applicationTitle;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Support email displayed on the OAuth consent screen.
     * 
     */
    @InputImport(name="supportEmail")
      private final @Nullable Input<String> supportEmail;

    public Input<String> getSupportEmail() {
        return this.supportEmail == null ? Input.empty() : this.supportEmail;
    }

    public BrandArgs(
        @Nullable Input<String> applicationTitle,
        @Nullable Input<String> project,
        @Nullable Input<String> supportEmail) {
        this.applicationTitle = applicationTitle;
        this.project = project;
        this.supportEmail = supportEmail;
    }

    private BrandArgs() {
        this.applicationTitle = Input.empty();
        this.project = Input.empty();
        this.supportEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationTitle;
        private @Nullable Input<String> project;
        private @Nullable Input<String> supportEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(BrandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationTitle = defaults.applicationTitle;
    	      this.project = defaults.project;
    	      this.supportEmail = defaults.supportEmail;
        }

        public Builder applicationTitle(@Nullable Input<String> applicationTitle) {
            this.applicationTitle = applicationTitle;
            return this;
        }

        public Builder applicationTitle(@Nullable String applicationTitle) {
            this.applicationTitle = Input.ofNullable(applicationTitle);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder supportEmail(@Nullable Input<String> supportEmail) {
            this.supportEmail = supportEmail;
            return this;
        }

        public Builder supportEmail(@Nullable String supportEmail) {
            this.supportEmail = Input.ofNullable(supportEmail);
            return this;
        }
        public BrandArgs build() {
            return new BrandArgs(applicationTitle, project, supportEmail);
        }
    }
}
