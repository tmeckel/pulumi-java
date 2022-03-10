// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LicenseArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PackageInfoOccurrence represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 * 
 */
public final class PackageInfoOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageInfoOccurrenceArgs Empty = new PackageInfoOccurrenceArgs();

    /**
     * A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    @InputImport(name="filename")
      private final @Nullable Input<String> filename;

    public Input<String> getFilename() {
        return this.filename == null ? Input.empty() : this.filename;
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * package or alternative values, if the governing license cannot be determined
     * 
     */
    @InputImport(name="licenseConcluded")
      private final @Nullable Input<LicenseArgs> licenseConcluded;

    public Input<LicenseArgs> getLicenseConcluded() {
        return this.licenseConcluded == null ? Input.empty() : this.licenseConcluded;
    }

    /**
     * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    @InputImport(name="sourceInfo")
      private final @Nullable Input<String> sourceInfo;

    public Input<String> getSourceInfo() {
        return this.sourceInfo == null ? Input.empty() : this.sourceInfo;
    }

    public PackageInfoOccurrenceArgs(
        @Nullable Input<String> comment,
        @Nullable Input<String> filename,
        @Nullable Input<String> id,
        @Nullable Input<LicenseArgs> licenseConcluded,
        @Nullable Input<String> sourceInfo) {
        this.comment = comment;
        this.filename = filename;
        this.id = id;
        this.licenseConcluded = licenseConcluded;
        this.sourceInfo = sourceInfo;
    }

    private PackageInfoOccurrenceArgs() {
        this.comment = Input.empty();
        this.filename = Input.empty();
        this.id = Input.empty();
        this.licenseConcluded = Input.empty();
        this.sourceInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> comment;
        private @Nullable Input<String> filename;
        private @Nullable Input<String> id;
        private @Nullable Input<LicenseArgs> licenseConcluded;
        private @Nullable Input<String> sourceInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.filename = defaults.filename;
    	      this.id = defaults.id;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.sourceInfo = defaults.sourceInfo;
        }

        public Builder comment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder filename(@Nullable Input<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder filename(@Nullable String filename) {
            this.filename = Input.ofNullable(filename);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder licenseConcluded(@Nullable Input<LicenseArgs> licenseConcluded) {
            this.licenseConcluded = licenseConcluded;
            return this;
        }

        public Builder licenseConcluded(@Nullable LicenseArgs licenseConcluded) {
            this.licenseConcluded = Input.ofNullable(licenseConcluded);
            return this;
        }

        public Builder sourceInfo(@Nullable Input<String> sourceInfo) {
            this.sourceInfo = sourceInfo;
            return this;
        }

        public Builder sourceInfo(@Nullable String sourceInfo) {
            this.sourceInfo = Input.ofNullable(sourceInfo);
            return this;
        }
        public PackageInfoOccurrenceArgs build() {
            return new PackageInfoOccurrenceArgs(comment, filename, id, licenseConcluded, sourceInfo);
        }
    }
}
