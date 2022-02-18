// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.enums.DiagnosticLevel;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiagnosticArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticArgs Empty = new DiagnosticArgs();

    /**
     * JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * Level to record this diagnostic.
     * 
     */
    @InputImport(name="level")
    private final @Nullable Input<DiagnosticLevel> level;

    public Input<DiagnosticLevel> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    public DiagnosticArgs(
        @Nullable Input<String> field,
        @Nullable Input<DiagnosticLevel> level) {
        this.field = field;
        this.level = level;
    }

    private DiagnosticArgs() {
        this.field = Input.empty();
        this.level = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> field;
        private @Nullable Input<DiagnosticLevel> level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.level = defaults.level;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setLevel(@Nullable Input<DiagnosticLevel> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable DiagnosticLevel level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public DiagnosticArgs build() {
            return new DiagnosticArgs(field, level);
        }
    }
}
