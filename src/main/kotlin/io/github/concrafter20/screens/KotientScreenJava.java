package io.github.concrafter20.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class KotientScreenJava extends Screen {

    // This is just a refecrence class to help me get a glimp of
    // the Kotlin code and trnaslate it

    protected final Screen parent;

    protected KotientScreenJava(Screen parent) {
        super(Text.literal("Kotient"));
        this.parent = parent;
    }

    public void close() {
        MinecraftClient.getInstance().setScreen(this.parent);
    }


    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        super.renderBackground(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 8, 16777215);
    }

}
