// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.LinuxOsState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a Linux OS.
 * 
 */
public final class LinuxOsInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxOsInfoArgs Empty = new LinuxOsInfoArgs();

    /**
     * The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
     * 
     */
    @Import(name="linuxOsState")
    private @Nullable Output<Either<String,LinuxOsState>> linuxOsState;

    /**
     * @return The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
     * 
     */
    public Optional<Output<Either<String,LinuxOsState>>> linuxOsState() {
        return Optional.ofNullable(this.linuxOsState);
    }

    private LinuxOsInfoArgs() {}

    private LinuxOsInfoArgs(LinuxOsInfoArgs $) {
        this.linuxOsState = $.linuxOsState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxOsInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxOsInfoArgs $;

        public Builder() {
            $ = new LinuxOsInfoArgs();
        }

        public Builder(LinuxOsInfoArgs defaults) {
            $ = new LinuxOsInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linuxOsState The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
         * 
         * @return builder
         * 
         */
        public Builder linuxOsState(@Nullable Output<Either<String,LinuxOsState>> linuxOsState) {
            $.linuxOsState = linuxOsState;
            return this;
        }

        /**
         * @param linuxOsState The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
         * 
         * @return builder
         * 
         */
        public Builder linuxOsState(Either<String,LinuxOsState> linuxOsState) {
            return linuxOsState(Output.of(linuxOsState));
        }

        /**
         * @param linuxOsState The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
         * 
         * @return builder
         * 
         */
        public Builder linuxOsState(String linuxOsState) {
            return linuxOsState(Either.ofLeft(linuxOsState));
        }

        /**
         * @param linuxOsState The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
         * 
         * @return builder
         * 
         */
        public Builder linuxOsState(LinuxOsState linuxOsState) {
            return linuxOsState(Either.ofRight(linuxOsState));
        }

        public LinuxOsInfoArgs build() {
            return $;
        }
    }

}
