// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepArchiveExtraction;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepDpkgInstallation;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepFileCopy;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepFileExec;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepMsiInstallation;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepRpmInstallation;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStepScriptRun;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipeInstallStep {
    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepArchiveExtraction archiveExtraction;
    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepDpkgInstallation dpkgInstallation;
    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepFileCopy fileCopy;
    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepFileExec fileExec;
    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepMsiInstallation msiInstallation;
    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepRpmInstallation rpmInstallation;
    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeInstallStepScriptRun scriptRun;

    @OutputCustomType.Constructor
    private GuestPoliciesRecipeInstallStep(
        @OutputCustomType.Parameter("archiveExtraction") @Nullable GuestPoliciesRecipeInstallStepArchiveExtraction archiveExtraction,
        @OutputCustomType.Parameter("dpkgInstallation") @Nullable GuestPoliciesRecipeInstallStepDpkgInstallation dpkgInstallation,
        @OutputCustomType.Parameter("fileCopy") @Nullable GuestPoliciesRecipeInstallStepFileCopy fileCopy,
        @OutputCustomType.Parameter("fileExec") @Nullable GuestPoliciesRecipeInstallStepFileExec fileExec,
        @OutputCustomType.Parameter("msiInstallation") @Nullable GuestPoliciesRecipeInstallStepMsiInstallation msiInstallation,
        @OutputCustomType.Parameter("rpmInstallation") @Nullable GuestPoliciesRecipeInstallStepRpmInstallation rpmInstallation,
        @OutputCustomType.Parameter("scriptRun") @Nullable GuestPoliciesRecipeInstallStepScriptRun scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepArchiveExtraction> getArchiveExtraction() {
        return Optional.ofNullable(this.archiveExtraction);
    }
    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepDpkgInstallation> getDpkgInstallation() {
        return Optional.ofNullable(this.dpkgInstallation);
    }
    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepFileCopy> getFileCopy() {
        return Optional.ofNullable(this.fileCopy);
    }
    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepFileExec> getFileExec() {
        return Optional.ofNullable(this.fileExec);
    }
    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepMsiInstallation> getMsiInstallation() {
        return Optional.ofNullable(this.msiInstallation);
    }
    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepRpmInstallation> getRpmInstallation() {
        return Optional.ofNullable(this.rpmInstallation);
    }
    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeInstallStepScriptRun> getScriptRun() {
        return Optional.ofNullable(this.scriptRun);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestPoliciesRecipeInstallStepArchiveExtraction archiveExtraction;
        private @Nullable GuestPoliciesRecipeInstallStepDpkgInstallation dpkgInstallation;
        private @Nullable GuestPoliciesRecipeInstallStepFileCopy fileCopy;
        private @Nullable GuestPoliciesRecipeInstallStepFileExec fileExec;
        private @Nullable GuestPoliciesRecipeInstallStepMsiInstallation msiInstallation;
        private @Nullable GuestPoliciesRecipeInstallStepRpmInstallation rpmInstallation;
        private @Nullable GuestPoliciesRecipeInstallStepScriptRun scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder archiveExtraction(@Nullable GuestPoliciesRecipeInstallStepArchiveExtraction archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }

        public Builder dpkgInstallation(@Nullable GuestPoliciesRecipeInstallStepDpkgInstallation dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }

        public Builder fileCopy(@Nullable GuestPoliciesRecipeInstallStepFileCopy fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }

        public Builder fileExec(@Nullable GuestPoliciesRecipeInstallStepFileExec fileExec) {
            this.fileExec = fileExec;
            return this;
        }

        public Builder msiInstallation(@Nullable GuestPoliciesRecipeInstallStepMsiInstallation msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }

        public Builder rpmInstallation(@Nullable GuestPoliciesRecipeInstallStepRpmInstallation rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }

        public Builder scriptRun(@Nullable GuestPoliciesRecipeInstallStepScriptRun scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }
        public GuestPoliciesRecipeInstallStep build() {
            return new GuestPoliciesRecipeInstallStep(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}
