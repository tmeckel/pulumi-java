// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleTimeZoneGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleTimeZoneGetArgs Empty = new PatchDeploymentRecurringScheduleTimeZoneGetArgs();

    /**
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public PatchDeploymentRecurringScheduleTimeZoneGetArgs(
        Output<String> id,
        @Nullable Output<String> version) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.version = version;
    }

    private PatchDeploymentRecurringScheduleTimeZoneGetArgs() {
        this.id = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleTimeZoneGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleTimeZoneGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public PatchDeploymentRecurringScheduleTimeZoneGetArgs build() {
            return new PatchDeploymentRecurringScheduleTimeZoneGetArgs(id, version);
        }
    }
}
