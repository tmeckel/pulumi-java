// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestAcceleratorNamesItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestAcceleratorTypesItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestBareMetal;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestBurstablePerformance;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestCpuManufacturersItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestInstanceGenerationsItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestLocalStorage;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestLocalStorageTypesItem;
import io.pulumi.awsnative.ec2.inputs.EC2FleetAcceleratorCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetAcceleratorTotalMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetBaselineEbsBandwidthMbpsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetMemoryGiBPerVCpuRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetNetworkInterfaceCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetTotalLocalStorageGBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetVCpuCountRangeRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetInstanceRequirementsRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetInstanceRequirementsRequestArgs Empty = new EC2FleetInstanceRequirementsRequestArgs();

    @Import(name="acceleratorCount")
      private final @Nullable Output<EC2FleetAcceleratorCountRequestArgs> acceleratorCount;

    public Output<EC2FleetAcceleratorCountRequestArgs> getAcceleratorCount() {
        return this.acceleratorCount == null ? Codegen.empty() : this.acceleratorCount;
    }

    @Import(name="acceleratorManufacturers")
      private final @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;

    public Output<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> getAcceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? Codegen.empty() : this.acceleratorManufacturers;
    }

    @Import(name="acceleratorNames")
      private final @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;

    public Output<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> getAcceleratorNames() {
        return this.acceleratorNames == null ? Codegen.empty() : this.acceleratorNames;
    }

    @Import(name="acceleratorTotalMemoryMiB")
      private final @Nullable Output<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;

    public Output<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB == null ? Codegen.empty() : this.acceleratorTotalMemoryMiB;
    }

    @Import(name="acceleratorTypes")
      private final @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;

    public Output<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> getAcceleratorTypes() {
        return this.acceleratorTypes == null ? Codegen.empty() : this.acceleratorTypes;
    }

    @Import(name="bareMetal")
      private final @Nullable Output<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal;

    public Output<EC2FleetInstanceRequirementsRequestBareMetal> getBareMetal() {
        return this.bareMetal == null ? Codegen.empty() : this.bareMetal;
    }

    @Import(name="baselineEbsBandwidthMbps")
      private final @Nullable Output<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;

    public Output<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps == null ? Codegen.empty() : this.baselineEbsBandwidthMbps;
    }

    @Import(name="burstablePerformance")
      private final @Nullable Output<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;

    public Output<EC2FleetInstanceRequirementsRequestBurstablePerformance> getBurstablePerformance() {
        return this.burstablePerformance == null ? Codegen.empty() : this.burstablePerformance;
    }

    @Import(name="cpuManufacturers")
      private final @Nullable Output<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;

    public Output<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> getCpuManufacturers() {
        return this.cpuManufacturers == null ? Codegen.empty() : this.cpuManufacturers;
    }

    @Import(name="excludedInstanceTypes")
      private final @Nullable Output<List<String>> excludedInstanceTypes;

    public Output<List<String>> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? Codegen.empty() : this.excludedInstanceTypes;
    }

    @Import(name="instanceGenerations")
      private final @Nullable Output<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;

    public Output<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> getInstanceGenerations() {
        return this.instanceGenerations == null ? Codegen.empty() : this.instanceGenerations;
    }

    @Import(name="localStorage")
      private final @Nullable Output<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage;

    public Output<EC2FleetInstanceRequirementsRequestLocalStorage> getLocalStorage() {
        return this.localStorage == null ? Codegen.empty() : this.localStorage;
    }

    @Import(name="localStorageTypes")
      private final @Nullable Output<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;

    public Output<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> getLocalStorageTypes() {
        return this.localStorageTypes == null ? Codegen.empty() : this.localStorageTypes;
    }

    @Import(name="memoryGiBPerVCpu")
      private final @Nullable Output<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;

    public Output<EC2FleetMemoryGiBPerVCpuRequestArgs> getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu == null ? Codegen.empty() : this.memoryGiBPerVCpu;
    }

    @Import(name="memoryMiB")
      private final @Nullable Output<EC2FleetMemoryMiBRequestArgs> memoryMiB;

    public Output<EC2FleetMemoryMiBRequestArgs> getMemoryMiB() {
        return this.memoryMiB == null ? Codegen.empty() : this.memoryMiB;
    }

    @Import(name="networkInterfaceCount")
      private final @Nullable Output<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;

    public Output<EC2FleetNetworkInterfaceCountRequestArgs> getNetworkInterfaceCount() {
        return this.networkInterfaceCount == null ? Codegen.empty() : this.networkInterfaceCount;
    }

    @Import(name="onDemandMaxPricePercentageOverLowestPrice")
      private final @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice;

    public Output<Integer> getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice == null ? Codegen.empty() : this.onDemandMaxPricePercentageOverLowestPrice;
    }

    @Import(name="requireHibernateSupport")
      private final @Nullable Output<Boolean> requireHibernateSupport;

    public Output<Boolean> getRequireHibernateSupport() {
        return this.requireHibernateSupport == null ? Codegen.empty() : this.requireHibernateSupport;
    }

    @Import(name="spotMaxPricePercentageOverLowestPrice")
      private final @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice;

    public Output<Integer> getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice == null ? Codegen.empty() : this.spotMaxPricePercentageOverLowestPrice;
    }

    @Import(name="totalLocalStorageGB")
      private final @Nullable Output<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;

    public Output<EC2FleetTotalLocalStorageGBRequestArgs> getTotalLocalStorageGB() {
        return this.totalLocalStorageGB == null ? Codegen.empty() : this.totalLocalStorageGB;
    }

    @Import(name="vCpuCount")
      private final @Nullable Output<EC2FleetVCpuCountRangeRequestArgs> vCpuCount;

    public Output<EC2FleetVCpuCountRangeRequestArgs> getVCpuCount() {
        return this.vCpuCount == null ? Codegen.empty() : this.vCpuCount;
    }

    public EC2FleetInstanceRequirementsRequestArgs(
        @Nullable Output<EC2FleetAcceleratorCountRequestArgs> acceleratorCount,
        @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers,
        @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames,
        @Nullable Output<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB,
        @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes,
        @Nullable Output<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal,
        @Nullable Output<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps,
        @Nullable Output<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance,
        @Nullable Output<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers,
        @Nullable Output<List<String>> excludedInstanceTypes,
        @Nullable Output<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations,
        @Nullable Output<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage,
        @Nullable Output<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes,
        @Nullable Output<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu,
        @Nullable Output<EC2FleetMemoryMiBRequestArgs> memoryMiB,
        @Nullable Output<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount,
        @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice,
        @Nullable Output<Boolean> requireHibernateSupport,
        @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice,
        @Nullable Output<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB,
        @Nullable Output<EC2FleetVCpuCountRangeRequestArgs> vCpuCount) {
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

    private EC2FleetInstanceRequirementsRequestArgs() {
        this.acceleratorCount = Codegen.empty();
        this.acceleratorManufacturers = Codegen.empty();
        this.acceleratorNames = Codegen.empty();
        this.acceleratorTotalMemoryMiB = Codegen.empty();
        this.acceleratorTypes = Codegen.empty();
        this.bareMetal = Codegen.empty();
        this.baselineEbsBandwidthMbps = Codegen.empty();
        this.burstablePerformance = Codegen.empty();
        this.cpuManufacturers = Codegen.empty();
        this.excludedInstanceTypes = Codegen.empty();
        this.instanceGenerations = Codegen.empty();
        this.localStorage = Codegen.empty();
        this.localStorageTypes = Codegen.empty();
        this.memoryGiBPerVCpu = Codegen.empty();
        this.memoryMiB = Codegen.empty();
        this.networkInterfaceCount = Codegen.empty();
        this.onDemandMaxPricePercentageOverLowestPrice = Codegen.empty();
        this.requireHibernateSupport = Codegen.empty();
        this.spotMaxPricePercentageOverLowestPrice = Codegen.empty();
        this.totalLocalStorageGB = Codegen.empty();
        this.vCpuCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetInstanceRequirementsRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EC2FleetAcceleratorCountRequestArgs> acceleratorCount;
        private @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;
        private @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;
        private @Nullable Output<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;
        private @Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;
        private @Nullable Output<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal;
        private @Nullable Output<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;
        private @Nullable Output<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;
        private @Nullable Output<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;
        private @Nullable Output<List<String>> excludedInstanceTypes;
        private @Nullable Output<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;
        private @Nullable Output<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage;
        private @Nullable Output<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;
        private @Nullable Output<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;
        private @Nullable Output<EC2FleetMemoryMiBRequestArgs> memoryMiB;
        private @Nullable Output<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;
        private @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice;
        private @Nullable Output<Boolean> requireHibernateSupport;
        private @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice;
        private @Nullable Output<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;
        private @Nullable Output<EC2FleetVCpuCountRangeRequestArgs> vCpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetInstanceRequirementsRequestArgs defaults) {
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

        public Builder acceleratorCount(@Nullable Output<EC2FleetAcceleratorCountRequestArgs> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }
        public Builder acceleratorCount(@Nullable EC2FleetAcceleratorCountRequestArgs acceleratorCount) {
            this.acceleratorCount = Codegen.ofNullable(acceleratorCount);
            return this;
        }
        public Builder acceleratorManufacturers(@Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }
        public Builder acceleratorManufacturers(@Nullable List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers) {
            this.acceleratorManufacturers = Codegen.ofNullable(acceleratorManufacturers);
            return this;
        }
        public Builder acceleratorManufacturers(EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem... acceleratorManufacturers) {
            return acceleratorManufacturers(List.of(acceleratorManufacturers));
        }
        public Builder acceleratorNames(@Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames) {
            this.acceleratorNames = acceleratorNames;
            return this;
        }
        public Builder acceleratorNames(@Nullable List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames) {
            this.acceleratorNames = Codegen.ofNullable(acceleratorNames);
            return this;
        }
        public Builder acceleratorNames(EC2FleetInstanceRequirementsRequestAcceleratorNamesItem... acceleratorNames) {
            return acceleratorNames(List.of(acceleratorNames));
        }
        public Builder acceleratorTotalMemoryMiB(@Nullable Output<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
            return this;
        }
        public Builder acceleratorTotalMemoryMiB(@Nullable EC2FleetAcceleratorTotalMemoryMiBRequestArgs acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = Codegen.ofNullable(acceleratorTotalMemoryMiB);
            return this;
        }
        public Builder acceleratorTypes(@Nullable Output<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }
        public Builder acceleratorTypes(@Nullable List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes) {
            this.acceleratorTypes = Codegen.ofNullable(acceleratorTypes);
            return this;
        }
        public Builder acceleratorTypes(EC2FleetInstanceRequirementsRequestAcceleratorTypesItem... acceleratorTypes) {
            return acceleratorTypes(List.of(acceleratorTypes));
        }
        public Builder bareMetal(@Nullable Output<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal) {
            this.bareMetal = bareMetal;
            return this;
        }
        public Builder bareMetal(@Nullable EC2FleetInstanceRequirementsRequestBareMetal bareMetal) {
            this.bareMetal = Codegen.ofNullable(bareMetal);
            return this;
        }
        public Builder baselineEbsBandwidthMbps(@Nullable Output<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }
        public Builder baselineEbsBandwidthMbps(@Nullable EC2FleetBaselineEbsBandwidthMbpsRequestArgs baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = Codegen.ofNullable(baselineEbsBandwidthMbps);
            return this;
        }
        public Builder burstablePerformance(@Nullable Output<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public Builder burstablePerformance(@Nullable EC2FleetInstanceRequirementsRequestBurstablePerformance burstablePerformance) {
            this.burstablePerformance = Codegen.ofNullable(burstablePerformance);
            return this;
        }
        public Builder cpuManufacturers(@Nullable Output<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }
        public Builder cpuManufacturers(@Nullable List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers) {
            this.cpuManufacturers = Codegen.ofNullable(cpuManufacturers);
            return this;
        }
        public Builder cpuManufacturers(EC2FleetInstanceRequirementsRequestCpuManufacturersItem... cpuManufacturers) {
            return cpuManufacturers(List.of(cpuManufacturers));
        }
        public Builder excludedInstanceTypes(@Nullable Output<List<String>> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public Builder excludedInstanceTypes(@Nullable List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = Codegen.ofNullable(excludedInstanceTypes);
            return this;
        }
        public Builder excludedInstanceTypes(String... excludedInstanceTypes) {
            return excludedInstanceTypes(List.of(excludedInstanceTypes));
        }
        public Builder instanceGenerations(@Nullable Output<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public Builder instanceGenerations(@Nullable List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations) {
            this.instanceGenerations = Codegen.ofNullable(instanceGenerations);
            return this;
        }
        public Builder instanceGenerations(EC2FleetInstanceRequirementsRequestInstanceGenerationsItem... instanceGenerations) {
            return instanceGenerations(List.of(instanceGenerations));
        }
        public Builder localStorage(@Nullable Output<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage) {
            this.localStorage = localStorage;
            return this;
        }
        public Builder localStorage(@Nullable EC2FleetInstanceRequirementsRequestLocalStorage localStorage) {
            this.localStorage = Codegen.ofNullable(localStorage);
            return this;
        }
        public Builder localStorageTypes(@Nullable Output<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }
        public Builder localStorageTypes(@Nullable List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes) {
            this.localStorageTypes = Codegen.ofNullable(localStorageTypes);
            return this;
        }
        public Builder localStorageTypes(EC2FleetInstanceRequirementsRequestLocalStorageTypesItem... localStorageTypes) {
            return localStorageTypes(List.of(localStorageTypes));
        }
        public Builder memoryGiBPerVCpu(@Nullable Output<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = memoryGiBPerVCpu;
            return this;
        }
        public Builder memoryGiBPerVCpu(@Nullable EC2FleetMemoryGiBPerVCpuRequestArgs memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = Codegen.ofNullable(memoryGiBPerVCpu);
            return this;
        }
        public Builder memoryMiB(@Nullable Output<EC2FleetMemoryMiBRequestArgs> memoryMiB) {
            this.memoryMiB = memoryMiB;
            return this;
        }
        public Builder memoryMiB(@Nullable EC2FleetMemoryMiBRequestArgs memoryMiB) {
            this.memoryMiB = Codegen.ofNullable(memoryMiB);
            return this;
        }
        public Builder networkInterfaceCount(@Nullable Output<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Builder networkInterfaceCount(@Nullable EC2FleetNetworkInterfaceCountRequestArgs networkInterfaceCount) {
            this.networkInterfaceCount = Codegen.ofNullable(networkInterfaceCount);
            return this;
        }
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = Codegen.ofNullable(onDemandMaxPricePercentageOverLowestPrice);
            return this;
        }
        public Builder requireHibernateSupport(@Nullable Output<Boolean> requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }
        public Builder requireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = Codegen.ofNullable(requireHibernateSupport);
            return this;
        }
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = Codegen.ofNullable(spotMaxPricePercentageOverLowestPrice);
            return this;
        }
        public Builder totalLocalStorageGB(@Nullable Output<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB) {
            this.totalLocalStorageGB = totalLocalStorageGB;
            return this;
        }
        public Builder totalLocalStorageGB(@Nullable EC2FleetTotalLocalStorageGBRequestArgs totalLocalStorageGB) {
            this.totalLocalStorageGB = Codegen.ofNullable(totalLocalStorageGB);
            return this;
        }
        public Builder vCpuCount(@Nullable Output<EC2FleetVCpuCountRangeRequestArgs> vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }
        public Builder vCpuCount(@Nullable EC2FleetVCpuCountRangeRequestArgs vCpuCount) {
            this.vCpuCount = Codegen.ofNullable(vCpuCount);
            return this;
        }        public EC2FleetInstanceRequirementsRequestArgs build() {
            return new EC2FleetInstanceRequirementsRequestArgs(acceleratorCount, acceleratorManufacturers, acceleratorNames, acceleratorTotalMemoryMiB, acceleratorTypes, bareMetal, baselineEbsBandwidthMbps, burstablePerformance, cpuManufacturers, excludedInstanceTypes, instanceGenerations, localStorage, localStorageTypes, memoryGiBPerVCpu, memoryMiB, networkInterfaceCount, onDemandMaxPricePercentageOverLowestPrice, requireHibernateSupport, spotMaxPricePercentageOverLowestPrice, totalLocalStorageGB, vCpuCount);
        }
    }
}
