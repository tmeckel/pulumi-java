// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScanConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScanConfigArgs Empty = new GetScanConfigArgs();

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="scanConfigId", required=true)
    private final String scanConfigId;

    public String getScanConfigId() {
        return this.scanConfigId;
    }

    public GetScanConfigArgs(
        @Nullable String project,
        String scanConfigId) {
        this.project = project;
        this.scanConfigId = Objects.requireNonNull(scanConfigId, "expected parameter 'scanConfigId' to be non-null");
    }

    private GetScanConfigArgs() {
        this.project = null;
        this.scanConfigId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String scanConfigId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScanConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.scanConfigId = defaults.scanConfigId;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setScanConfigId(String scanConfigId) {
            this.scanConfigId = Objects.requireNonNull(scanConfigId);
            return this;
        }

        public GetScanConfigArgs build() {
            return new GetScanConfigArgs(project, scanConfigId);
        }
    }
}
