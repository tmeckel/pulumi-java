// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorNamesItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorTypesItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestBareMetal;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestBurstablePerformance;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestCpuManufacturersItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestInstanceGenerationsItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestLocalStorage;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestLocalStorageTypesItem;
import io.pulumi.awsnative.ec2.inputs.SpotFleetAcceleratorCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetAcceleratorTotalMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetBaselineEbsBandwidthMbpsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMemoryGiBPerVCpuRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetNetworkInterfaceCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTotalLocalStorageGBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetVCpuCountRangeRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetInstanceRequirementsRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetInstanceRequirementsRequestArgs Empty = new SpotFleetInstanceRequirementsRequestArgs();

    @InputImport(name="acceleratorCount")
      private final @Nullable Input<SpotFleetAcceleratorCountRequestArgs> acceleratorCount;

    public Input<SpotFleetAcceleratorCountRequestArgs> getAcceleratorCount() {
        return this.acceleratorCount == null ? Input.empty() : this.acceleratorCount;
    }

    @InputImport(name="acceleratorManufacturers")
      private final @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;

    public Input<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> getAcceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? Input.empty() : this.acceleratorManufacturers;
    }

    @InputImport(name="acceleratorNames")
      private final @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;

    public Input<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> getAcceleratorNames() {
        return this.acceleratorNames == null ? Input.empty() : this.acceleratorNames;
    }

    @InputImport(name="acceleratorTotalMemoryMiB")
      private final @Nullable Input<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;

    public Input<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB == null ? Input.empty() : this.acceleratorTotalMemoryMiB;
    }

    @InputImport(name="acceleratorTypes")
      private final @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;

    public Input<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> getAcceleratorTypes() {
        return this.acceleratorTypes == null ? Input.empty() : this.acceleratorTypes;
    }

    @InputImport(name="bareMetal")
      private final @Nullable Input<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal;

    public Input<SpotFleetInstanceRequirementsRequestBareMetal> getBareMetal() {
        return this.bareMetal == null ? Input.empty() : this.bareMetal;
    }

    @InputImport(name="baselineEbsBandwidthMbps")
      private final @Nullable Input<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;

    public Input<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps == null ? Input.empty() : this.baselineEbsBandwidthMbps;
    }

    @InputImport(name="burstablePerformance")
      private final @Nullable Input<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;

    public Input<SpotFleetInstanceRequirementsRequestBurstablePerformance> getBurstablePerformance() {
        return this.burstablePerformance == null ? Input.empty() : this.burstablePerformance;
    }

    @InputImport(name="cpuManufacturers")
      private final @Nullable Input<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;

    public Input<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> getCpuManufacturers() {
        return this.cpuManufacturers == null ? Input.empty() : this.cpuManufacturers;
    }

    @InputImport(name="excludedInstanceTypes")
      private final @Nullable Input<List<String>> excludedInstanceTypes;

    public Input<List<String>> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? Input.empty() : this.excludedInstanceTypes;
    }

    @InputImport(name="instanceGenerations")
      private final @Nullable Input<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;

    public Input<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> getInstanceGenerations() {
        return this.instanceGenerations == null ? Input.empty() : this.instanceGenerations;
    }

    @InputImport(name="localStorage")
      private final @Nullable Input<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage;

    public Input<SpotFleetInstanceRequirementsRequestLocalStorage> getLocalStorage() {
        return this.localStorage == null ? Input.empty() : this.localStorage;
    }

    @InputImport(name="localStorageTypes")
      private final @Nullable Input<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;

    public Input<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> getLocalStorageTypes() {
        return this.localStorageTypes == null ? Input.empty() : this.localStorageTypes;
    }

    @InputImport(name="memoryGiBPerVCpu")
      private final @Nullable Input<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;

    public Input<SpotFleetMemoryGiBPerVCpuRequestArgs> getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu == null ? Input.empty() : this.memoryGiBPerVCpu;
    }

    @InputImport(name="memoryMiB")
      private final @Nullable Input<SpotFleetMemoryMiBRequestArgs> memoryMiB;

    public Input<SpotFleetMemoryMiBRequestArgs> getMemoryMiB() {
        return this.memoryMiB == null ? Input.empty() : this.memoryMiB;
    }

    @InputImport(name="networkInterfaceCount")
      private final @Nullable Input<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;

    public Input<SpotFleetNetworkInterfaceCountRequestArgs> getNetworkInterfaceCount() {
        return this.networkInterfaceCount == null ? Input.empty() : this.networkInterfaceCount;
    }

    @InputImport(name="onDemandMaxPricePercentageOverLowestPrice")
      private final @Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice;

    public Input<Integer> getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice == null ? Input.empty() : this.onDemandMaxPricePercentageOverLowestPrice;
    }

    @InputImport(name="requireHibernateSupport")
      private final @Nullable Input<Boolean> requireHibernateSupport;

    public Input<Boolean> getRequireHibernateSupport() {
        return this.requireHibernateSupport == null ? Input.empty() : this.requireHibernateSupport;
    }

    @InputImport(name="spotMaxPricePercentageOverLowestPrice")
      private final @Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice;

    public Input<Integer> getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice == null ? Input.empty() : this.spotMaxPricePercentageOverLowestPrice;
    }

    @InputImport(name="totalLocalStorageGB")
      private final @Nullable Input<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;

    public Input<SpotFleetTotalLocalStorageGBRequestArgs> getTotalLocalStorageGB() {
        return this.totalLocalStorageGB == null ? Input.empty() : this.totalLocalStorageGB;
    }

    @InputImport(name="vCpuCount")
      private final @Nullable Input<SpotFleetVCpuCountRangeRequestArgs> vCpuCount;

    public Input<SpotFleetVCpuCountRangeRequestArgs> getVCpuCount() {
        return this.vCpuCount == null ? Input.empty() : this.vCpuCount;
    }

    public SpotFleetInstanceRequirementsRequestArgs(
        @Nullable Input<SpotFleetAcceleratorCountRequestArgs> acceleratorCount,
        @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers,
        @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames,
        @Nullable Input<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB,
        @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes,
        @Nullable Input<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal,
        @Nullable Input<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps,
        @Nullable Input<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance,
        @Nullable Input<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers,
        @Nullable Input<List<String>> excludedInstanceTypes,
        @Nullable Input<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations,
        @Nullable Input<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage,
        @Nullable Input<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes,
        @Nullable Input<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu,
        @Nullable Input<SpotFleetMemoryMiBRequestArgs> memoryMiB,
        @Nullable Input<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount,
        @Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice,
        @Nullable Input<Boolean> requireHibernateSupport,
        @Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice,
        @Nullable Input<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB,
        @Nullable Input<SpotFleetVCpuCountRangeRequestArgs> vCpuCount) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorManufacturers = acceleratorManufacturers;
        this.acceleratorNames = acceleratorNames;
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
        this.acceleratorTypes = acceleratorTypes;
        this.bareMetal = bareMetal;
        this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
        this.burstablePerformance = burstablePerformance;
        this.cpuManufacturers = cpuManufacturers;
        this.excludedInstanceTypes = excludedInstanceTypes;
        this.instanceGenerations = instanceGenerations;
        this.localStorage = localStorage;
        this.localStorageTypes = localStorageTypes;
        this.memoryGiBPerVCpu = memoryGiBPerVCpu;
        this.memoryMiB = memoryMiB;
        this.networkInterfaceCount = networkInterfaceCount;
        this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
        this.requireHibernateSupport = requireHibernateSupport;
        this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
        this.totalLocalStorageGB = totalLocalStorageGB;
        this.vCpuCount = vCpuCount;
    }

    private SpotFleetInstanceRequirementsRequestArgs() {
        this.acceleratorCount = Input.empty();
        this.acceleratorManufacturers = Input.empty();
        this.acceleratorNames = Input.empty();
        this.acceleratorTotalMemoryMiB = Input.empty();
        this.acceleratorTypes = Input.empty();
        this.bareMetal = Input.empty();
        this.baselineEbsBandwidthMbps = Input.empty();
        this.burstablePerformance = Input.empty();
        this.cpuManufacturers = Input.empty();
        this.excludedInstanceTypes = Input.empty();
        this.instanceGenerations = Input.empty();
        this.localStorage = Input.empty();
        this.localStorageTypes = Input.empty();
        this.memoryGiBPerVCpu = Input.empty();
        this.memoryMiB = Input.empty();
        this.networkInterfaceCount = Input.empty();
        this.onDemandMaxPricePercentageOverLowestPrice = Input.empty();
        this.requireHibernateSupport = Input.empty();
        this.spotMaxPricePercentageOverLowestPrice = Input.empty();
        this.totalLocalStorageGB = Input.empty();
        this.vCpuCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetInstanceRequirementsRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SpotFleetAcceleratorCountRequestArgs> acceleratorCount;
        private @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;
        private @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;
        private @Nullable Input<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;
        private @Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;
        private @Nullable Input<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal;
        private @Nullable Input<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;
        private @Nullable Input<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;
        private @Nullable Input<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;
        private @Nullable Input<List<String>> excludedInstanceTypes;
        private @Nullable Input<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;
        private @Nullable Input<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage;
        private @Nullable Input<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;
        private @Nullable Input<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;
        private @Nullable Input<SpotFleetMemoryMiBRequestArgs> memoryMiB;
        private @Nullable Input<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;
        private @Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice;
        private @Nullable Input<Boolean> requireHibernateSupport;
        private @Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice;
        private @Nullable Input<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;
        private @Nullable Input<SpotFleetVCpuCountRangeRequestArgs> vCpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetInstanceRequirementsRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorManufacturers = defaults.acceleratorManufacturers;
    	      this.acceleratorNames = defaults.acceleratorNames;
    	      this.acceleratorTotalMemoryMiB = defaults.acceleratorTotalMemoryMiB;
    	      this.acceleratorTypes = defaults.acceleratorTypes;
    	      this.bareMetal = defaults.bareMetal;
    	      this.baselineEbsBandwidthMbps = defaults.baselineEbsBandwidthMbps;
    	      this.burstablePerformance = defaults.burstablePerformance;
    	      this.cpuManufacturers = defaults.cpuManufacturers;
    	      this.excludedInstanceTypes = defaults.excludedInstanceTypes;
    	      this.instanceGenerations = defaults.instanceGenerations;
    	      this.localStorage = defaults.localStorage;
    	      this.localStorageTypes = defaults.localStorageTypes;
    	      this.memoryGiBPerVCpu = defaults.memoryGiBPerVCpu;
    	      this.memoryMiB = defaults.memoryMiB;
    	      this.networkInterfaceCount = defaults.networkInterfaceCount;
    	      this.onDemandMaxPricePercentageOverLowestPrice = defaults.onDemandMaxPricePercentageOverLowestPrice;
    	      this.requireHibernateSupport = defaults.requireHibernateSupport;
    	      this.spotMaxPricePercentageOverLowestPrice = defaults.spotMaxPricePercentageOverLowestPrice;
    	      this.totalLocalStorageGB = defaults.totalLocalStorageGB;
    	      this.vCpuCount = defaults.vCpuCount;
        }

        public Builder acceleratorCount(@Nullable Input<SpotFleetAcceleratorCountRequestArgs> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder acceleratorCount(@Nullable SpotFleetAcceleratorCountRequestArgs acceleratorCount) {
            this.acceleratorCount = Input.ofNullable(acceleratorCount);
            return this;
        }

        public Builder acceleratorManufacturers(@Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }

        public Builder acceleratorManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers) {
            this.acceleratorManufacturers = Input.ofNullable(acceleratorManufacturers);
            return this;
        }

        public Builder acceleratorNames(@Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames) {
            this.acceleratorNames = acceleratorNames;
            return this;
        }

        public Builder acceleratorNames(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames) {
            this.acceleratorNames = Input.ofNullable(acceleratorNames);
            return this;
        }

        public Builder acceleratorTotalMemoryMiB(@Nullable Input<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
            return this;
        }

        public Builder acceleratorTotalMemoryMiB(@Nullable SpotFleetAcceleratorTotalMemoryMiBRequestArgs acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = Input.ofNullable(acceleratorTotalMemoryMiB);
            return this;
        }

        public Builder acceleratorTypes(@Nullable Input<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }

        public Builder acceleratorTypes(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes) {
            this.acceleratorTypes = Input.ofNullable(acceleratorTypes);
            return this;
        }

        public Builder bareMetal(@Nullable Input<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal) {
            this.bareMetal = bareMetal;
            return this;
        }

        public Builder bareMetal(@Nullable SpotFleetInstanceRequirementsRequestBareMetal bareMetal) {
            this.bareMetal = Input.ofNullable(bareMetal);
            return this;
        }

        public Builder baselineEbsBandwidthMbps(@Nullable Input<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }

        public Builder baselineEbsBandwidthMbps(@Nullable SpotFleetBaselineEbsBandwidthMbpsRequestArgs baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = Input.ofNullable(baselineEbsBandwidthMbps);
            return this;
        }

        public Builder burstablePerformance(@Nullable Input<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }

        public Builder burstablePerformance(@Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance) {
            this.burstablePerformance = Input.ofNullable(burstablePerformance);
            return this;
        }

        public Builder cpuManufacturers(@Nullable Input<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }

        public Builder cpuManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers) {
            this.cpuManufacturers = Input.ofNullable(cpuManufacturers);
            return this;
        }

        public Builder excludedInstanceTypes(@Nullable Input<List<String>> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }

        public Builder excludedInstanceTypes(@Nullable List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = Input.ofNullable(excludedInstanceTypes);
            return this;
        }

        public Builder instanceGenerations(@Nullable Input<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }

        public Builder instanceGenerations(@Nullable List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations) {
            this.instanceGenerations = Input.ofNullable(instanceGenerations);
            return this;
        }

        public Builder localStorage(@Nullable Input<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage) {
            this.localStorage = localStorage;
            return this;
        }

        public Builder localStorage(@Nullable SpotFleetInstanceRequirementsRequestLocalStorage localStorage) {
            this.localStorage = Input.ofNullable(localStorage);
            return this;
        }

        public Builder localStorageTypes(@Nullable Input<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }

        public Builder localStorageTypes(@Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes) {
            this.localStorageTypes = Input.ofNullable(localStorageTypes);
            return this;
        }

        public Builder memoryGiBPerVCpu(@Nullable Input<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = memoryGiBPerVCpu;
            return this;
        }

        public Builder memoryGiBPerVCpu(@Nullable SpotFleetMemoryGiBPerVCpuRequestArgs memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = Input.ofNullable(memoryGiBPerVCpu);
            return this;
        }

        public Builder memoryMiB(@Nullable Input<SpotFleetMemoryMiBRequestArgs> memoryMiB) {
            this.memoryMiB = memoryMiB;
            return this;
        }

        public Builder memoryMiB(@Nullable SpotFleetMemoryMiBRequestArgs memoryMiB) {
            this.memoryMiB = Input.ofNullable(memoryMiB);
            return this;
        }

        public Builder networkInterfaceCount(@Nullable Input<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }

        public Builder networkInterfaceCount(@Nullable SpotFleetNetworkInterfaceCountRequestArgs networkInterfaceCount) {
            this.networkInterfaceCount = Input.ofNullable(networkInterfaceCount);
            return this;
        }

        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }

        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = Input.ofNullable(onDemandMaxPricePercentageOverLowestPrice);
            return this;
        }

        public Builder requireHibernateSupport(@Nullable Input<Boolean> requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }

        public Builder requireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = Input.ofNullable(requireHibernateSupport);
            return this;
        }

        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }

        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = Input.ofNullable(spotMaxPricePercentageOverLowestPrice);
            return this;
        }

        public Builder totalLocalStorageGB(@Nullable Input<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB) {
            this.totalLocalStorageGB = totalLocalStorageGB;
            return this;
        }

        public Builder totalLocalStorageGB(@Nullable SpotFleetTotalLocalStorageGBRequestArgs totalLocalStorageGB) {
            this.totalLocalStorageGB = Input.ofNullable(totalLocalStorageGB);
            return this;
        }

        public Builder vCpuCount(@Nullable Input<SpotFleetVCpuCountRangeRequestArgs> vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }

        public Builder vCpuCount(@Nullable SpotFleetVCpuCountRangeRequestArgs vCpuCount) {
            this.vCpuCount = Input.ofNullable(vCpuCount);
            return this;
        }
        public SpotFleetInstanceRequirementsRequestArgs build() {
            return new SpotFleetInstanceRequirementsRequestArgs(acceleratorCount, acceleratorManufacturers, acceleratorNames, acceleratorTotalMemoryMiB, acceleratorTypes, bareMetal, baselineEbsBandwidthMbps, burstablePerformance, cpuManufacturers, excludedInstanceTypes, instanceGenerations, localStorage, localStorageTypes, memoryGiBPerVCpu, memoryMiB, networkInterfaceCount, onDemandMaxPricePercentageOverLowestPrice, requireHibernateSupport, spotMaxPricePercentageOverLowestPrice, totalLocalStorageGB, vCpuCount);
        }
    }
}
