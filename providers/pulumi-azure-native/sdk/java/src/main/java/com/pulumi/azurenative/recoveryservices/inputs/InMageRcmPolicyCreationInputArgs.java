// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InMageRcm policy creation input.
 * 
 */
public final class InMageRcmPolicyCreationInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final InMageRcmPolicyCreationInputArgs Empty = new InMageRcmPolicyCreationInputArgs();

    /**
     * The app consistent snapshot frequency (in minutes).
     * 
     */
    @Import(name="appConsistentFrequencyInMinutes")
    private @Nullable Output<Integer> appConsistentFrequencyInMinutes;

    /**
     * @return The app consistent snapshot frequency (in minutes).
     * 
     */
    public Optional<Output<Integer>> appConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }

    /**
     * The crash consistent snapshot frequency (in minutes).
     * 
     */
    @Import(name="crashConsistentFrequencyInMinutes")
    private @Nullable Output<Integer> crashConsistentFrequencyInMinutes;

    /**
     * @return The crash consistent snapshot frequency (in minutes).
     * 
     */
    public Optional<Output<Integer>> crashConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.crashConsistentFrequencyInMinutes);
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    @Import(name="enableMultiVmSync")
    private @Nullable Output<String> enableMultiVmSync;

    /**
     * @return A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    public Optional<Output<String>> enableMultiVmSync() {
        return Optional.ofNullable(this.enableMultiVmSync);
    }

    /**
     * The class type.
     * Expected value is &#39;InMageRcm&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The class type.
     * Expected value is &#39;InMageRcm&#39;.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointHistoryInMinutes")
    private @Nullable Output<Integer> recoveryPointHistoryInMinutes;

    /**
     * @return The duration in minutes until which the recovery points need to be stored.
     * 
     */
    public Optional<Output<Integer>> recoveryPointHistoryInMinutes() {
        return Optional.ofNullable(this.recoveryPointHistoryInMinutes);
    }

    private InMageRcmPolicyCreationInputArgs() {}

    private InMageRcmPolicyCreationInputArgs(InMageRcmPolicyCreationInputArgs $) {
        this.appConsistentFrequencyInMinutes = $.appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = $.crashConsistentFrequencyInMinutes;
        this.enableMultiVmSync = $.enableMultiVmSync;
        this.instanceType = $.instanceType;
        this.recoveryPointHistoryInMinutes = $.recoveryPointHistoryInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageRcmPolicyCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageRcmPolicyCreationInputArgs $;

        public Builder() {
            $ = new InMageRcmPolicyCreationInputArgs();
        }

        public Builder(InMageRcmPolicyCreationInputArgs defaults) {
            $ = new InMageRcmPolicyCreationInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appConsistentFrequencyInMinutes The app consistent snapshot frequency (in minutes).
         * 
         * @return builder
         * 
         */
        public Builder appConsistentFrequencyInMinutes(@Nullable Output<Integer> appConsistentFrequencyInMinutes) {
            $.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        /**
         * @param appConsistentFrequencyInMinutes The app consistent snapshot frequency (in minutes).
         * 
         * @return builder
         * 
         */
        public Builder appConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
            return appConsistentFrequencyInMinutes(Output.of(appConsistentFrequencyInMinutes));
        }

        /**
         * @param crashConsistentFrequencyInMinutes The crash consistent snapshot frequency (in minutes).
         * 
         * @return builder
         * 
         */
        public Builder crashConsistentFrequencyInMinutes(@Nullable Output<Integer> crashConsistentFrequencyInMinutes) {
            $.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }

        /**
         * @param crashConsistentFrequencyInMinutes The crash consistent snapshot frequency (in minutes).
         * 
         * @return builder
         * 
         */
        public Builder crashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
            return crashConsistentFrequencyInMinutes(Output.of(crashConsistentFrequencyInMinutes));
        }

        /**
         * @param enableMultiVmSync A value indicating whether multi-VM sync has to be enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableMultiVmSync(@Nullable Output<String> enableMultiVmSync) {
            $.enableMultiVmSync = enableMultiVmSync;
            return this;
        }

        /**
         * @param enableMultiVmSync A value indicating whether multi-VM sync has to be enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableMultiVmSync(String enableMultiVmSync) {
            return enableMultiVmSync(Output.of(enableMultiVmSync));
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;InMageRcm&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;InMageRcm&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param recoveryPointHistoryInMinutes The duration in minutes until which the recovery points need to be stored.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointHistoryInMinutes(@Nullable Output<Integer> recoveryPointHistoryInMinutes) {
            $.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
            return this;
        }

        /**
         * @param recoveryPointHistoryInMinutes The duration in minutes until which the recovery points need to be stored.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointHistoryInMinutes(Integer recoveryPointHistoryInMinutes) {
            return recoveryPointHistoryInMinutes(Output.of(recoveryPointHistoryInMinutes));
        }

        public InMageRcmPolicyCreationInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            return $;
        }
    }

}
