// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSslCertArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSslCertArgs Empty = new GetSslCertArgs();

    @InputImport(name="instance", required=true)
      private final String instance;

    public String getInstance() {
        return this.instance;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="sha1Fingerprint", required=true)
      private final String sha1Fingerprint;

    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public GetSslCertArgs(
        String instance,
        @Nullable String project,
        String sha1Fingerprint) {
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.project = project;
        this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
    }

    private GetSslCertArgs() {
        this.instance = null;
        this.project = null;
        this.sha1Fingerprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSslCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instance;
        private @Nullable String project;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSslCertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.project = defaults.project;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder sha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }
        public GetSslCertArgs build() {
            return new GetSslCertArgs(instance, project, sha1Fingerprint);
        }
    }
}
