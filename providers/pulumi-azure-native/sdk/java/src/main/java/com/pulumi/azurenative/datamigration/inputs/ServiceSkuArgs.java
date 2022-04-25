// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure SKU instance
 * 
 */
public final class ServiceSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSkuArgs Empty = new ServiceSkuArgs();

    /**
     * The capacity of the SKU, if it supports scaling
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The capacity of the SKU, if it supports scaling
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The SKU family, used when the service has multiple performance classes within a tier, such as &#39;A&#39;, &#39;D&#39;, etc. for virtual machines
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return The SKU family, used when the service has multiple performance classes within a tier, such as &#39;A&#39;, &#39;D&#39;, etc. for virtual machines
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The unique name of the SKU, such as &#39;P3&#39;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the SKU, such as &#39;P3&#39;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The size of the SKU, used when the name alone does not denote a service size or when a SKU has multiple performance classes within a family, e.g. &#39;A1&#39; for virtual machines
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The size of the SKU, used when the name alone does not denote a service size or when a SKU has multiple performance classes within a family, e.g. &#39;A1&#39; for virtual machines
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The tier of the SKU, such as &#39;Free&#39;, &#39;Basic&#39;, &#39;Standard&#39;, or &#39;Premium&#39;
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The tier of the SKU, such as &#39;Free&#39;, &#39;Basic&#39;, &#39;Standard&#39;, or &#39;Premium&#39;
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private ServiceSkuArgs() {}

    private ServiceSkuArgs(ServiceSkuArgs $) {
        this.capacity = $.capacity;
        this.family = $.family;
        this.name = $.name;
        this.size = $.size;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSkuArgs $;

        public Builder() {
            $ = new ServiceSkuArgs();
        }

        public Builder(ServiceSkuArgs defaults) {
            $ = new ServiceSkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The capacity of the SKU, if it supports scaling
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The capacity of the SKU, if it supports scaling
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param family The SKU family, used when the service has multiple performance classes within a tier, such as &#39;A&#39;, &#39;D&#39;, etc. for virtual machines
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The SKU family, used when the service has multiple performance classes within a tier, such as &#39;A&#39;, &#39;D&#39;, etc. for virtual machines
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param name The unique name of the SKU, such as &#39;P3&#39;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the SKU, such as &#39;P3&#39;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param size The size of the SKU, used when the name alone does not denote a service size or when a SKU has multiple performance classes within a family, e.g. &#39;A1&#39; for virtual machines
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the SKU, used when the name alone does not denote a service size or when a SKU has multiple performance classes within a family, e.g. &#39;A1&#39; for virtual machines
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param tier The tier of the SKU, such as &#39;Free&#39;, &#39;Basic&#39;, &#39;Standard&#39;, or &#39;Premium&#39;
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the SKU, such as &#39;Free&#39;, &#39;Basic&#39;, &#39;Standard&#39;, or &#39;Premium&#39;
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public ServiceSkuArgs build() {
            return $;
        }
    }

}
